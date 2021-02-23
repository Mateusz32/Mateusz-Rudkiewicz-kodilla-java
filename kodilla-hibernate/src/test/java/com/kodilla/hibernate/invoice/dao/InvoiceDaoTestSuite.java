package com.kodilla.hibernate.invoice.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("2021/02/22");

        Item item1 = new Item(new Product("Carrot"), new BigDecimal(20), 10, new BigDecimal(200));
        Item item2 = new Item(new Product("Apple"), new BigDecimal(25.5), 13, new BigDecimal(331.5));
        Item item3 = new Item(new Product("Cherry"), new BigDecimal(31.20), 23, new BigDecimal(717.6));
        Item item4 = new Item(new Product("Carrot"), new BigDecimal(15.60), 26, new BigDecimal(405.6));
        Item item5 = new Item(new Product("Apple"), new BigDecimal(11.1), 17, new BigDecimal(188.7));

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);

    }
}
