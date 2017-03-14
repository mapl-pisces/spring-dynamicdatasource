package com.ai.duxiefenli;

public interface DuxieInterface {

	@DataSource("master")
	public String selectTest(String ntAccount,boolean iswin);
	
	@DataSource("slave")
	public String updateTest(String ntAccount,boolean iswin);
}
