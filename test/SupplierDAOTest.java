package com.niit.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.SupplierDAO;
import com.niit.model.Supplier;

public class SupplierDAOTest {
static SupplierDAO supplierDAO;

@BeforeClass
public static void initialize()
{
AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext();
contex.scan("com.niit");
contex.refresh();
supplierDAO=(SupplierDAO)contex.getBean("supplierDAO");

}
@Test
public void addSupplier() {
Supplier supplier=new Supplier();
supplier.setName("mr.sri");
supplier.setDescription("pubg pro");
assertTrue("problem in adding Supplier",supplierDAO.addSupplier(supplier));
}

}

