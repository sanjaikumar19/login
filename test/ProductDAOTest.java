package com.niit.test;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.ProductDAO;
import com.niit.model.Product;

public class ProductDAOTest {
static ProductDAO productDAO;

@BeforeClass
public static void initialize()
{
AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext();
contex.scan("com.niit");
contex.refresh();
productDAO=(ProductDAO)contex.getBean("productDAO");

}
@Test
public void addProduct() {
Product product=new Product();
product.setProductName("Mr.Carder");
product.setProductDesc("serious buyers DM me");
assertTrue("problem in adding category",productDAO.addProduct(product));
}

}

