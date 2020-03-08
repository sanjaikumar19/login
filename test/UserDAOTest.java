package com.niit.test;


import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.UserDAO;
import com.niit.model.User;

public class UserDAOTest {
static UserDAO userDAO;

@BeforeClass
public static void initialize()
{
AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext();
contex.scan("com.niit");
contex.refresh();
userDAO=(UserDAO)contex.getBean("userDAO");

}
@Test
public void addUser() {
User user=new User();
user.setUserName("Mr.sanjai");
user.setCustomerName("gayatree");
user.setEmail("sanjai19kumar@gmail.com");
user.setMobileNo("7010570680");
user.setPassword("galgodat");


}

}

