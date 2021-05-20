package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CompanyAndEmployeeFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> getListOfCompanyWithPartialName(String partialNameOfCompany){
       return companyDao.findCompanyByPartialName(partialNameOfCompany);
    }

    public List<Employee> getListEmployeeWithPartialName(String partialNameOfEmploye){
        return employeeDao.findEmployeeByPartialName(partialNameOfEmploye);
    }

}
