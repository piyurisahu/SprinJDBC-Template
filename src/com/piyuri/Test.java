package com.piyuri;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
		EmployeeDao dao=(EmployeeDao) ctx.getBean("edao");
		
		int status=dao.saveEmployee(new Employee(105,"piyuri",8070));
		System.out.println(status);
	
	
	}

}
