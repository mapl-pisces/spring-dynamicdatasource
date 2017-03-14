package com.ai.system;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ai.duxiefenli.DuxieInterface;

/**
 *  测试
 */
public class DubboServiceStart {
	private static final Logger log = LogManager
			.getLogger(DubboServiceStart.class.getName());

	@SuppressWarnings("resource")
	private static void startDubboService() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath*:spring/applicationContext.xml" });
		context.registerShutdownHook();
		context.start();
		
		DuxieInterface duxieTest = (DuxieInterface) context.getBean("duxieTest");
		/*while (true) {
			try {
				Thread.currentThread();
				Thread.sleep(3000L);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
		duxieTest.selectTest("1", true);
		duxieTest.updateTest("1", true);
		System.out.println();
	}

	public static void main(String[] args) {
		startDubboService();
	}
}
