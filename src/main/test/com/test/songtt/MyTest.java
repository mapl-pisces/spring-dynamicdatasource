package com.test.songtt;

import java.io.IOException;
import java.net.URISyntaxException;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ai.aisse.core.service.IEmployeeinfoSv;
import com.ai.aisse.utils.HttpClientUtil;

public class MyTest {
	
	public static void main(String[] args) {
		
		new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
		//System.out.println("-----");
		//new MyTest().doJob1Test();
	}


}
