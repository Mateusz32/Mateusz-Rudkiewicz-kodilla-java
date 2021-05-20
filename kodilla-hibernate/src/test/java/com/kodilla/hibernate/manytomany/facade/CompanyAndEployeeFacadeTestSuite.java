package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CompanyAndEployeeFacadeTestSuite {
    @Autowired
    private CompanyAndEmployeeFacade companyAndEmployeeFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    Employee johnSmith = new Employee("John", "Smith");
    Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
    Employee stephanKovalsky = new Employee("Linda", "Kovalsky");

    Company softwareMachine = new Company("Software Machine");
    Company dataMaesters = new Company("Data Maesters");
    Company greyMatter = new Company("Grey Matter");

    @BeforeEach
    void setEmployeeAndCompany() {
        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(stephanKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(stephanKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        stephanKovalsky.getCompanies().add(dataMaesters);
        stephanKovalsky.getCompanies().add(greyMatter);
    }

    @Test
    public void testGetCompaniesByPartialName() {
        //GIVEN

        //WHEN
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        int quantityOfCompaniesByPartialName = companyAndEmployeeFacade
                .getListOfCompanyWithPartialName("Ma")
                .size();

        //THEN
        assertEquals(3, quantityOfCompaniesByPartialName);

        //CLEAN UP
        companyDao.deleteAll();
    }

    @Test
    public void testGetEmployeeByPartialName() {
        //GIVEN

        //WHEN
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(stephanKovalsky);
        System.out.println("ilosc "+employeeDao.count());
        int quantityOfEmployeesByPartialName = companyAndEmployeeFacade
                .getListEmployeeWithPartialName("cl")
                .size();
        //THEN
        assertEquals(1, quantityOfEmployeesByPartialName);

        //CLEAN UP
        employeeDao.deleteAll();
    }
}