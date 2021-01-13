package com.qa.main;

public class Lizard extends Animal {
	
	protected String size = "None";
	protected int teeth = 1;
	protected String tai = "None";
	
	@Override
	public void theSame() {
		System.out.println("WE ARE LIZARDS");
		
	}
	
	public void allforOne() {
		System.out.println("Every lizard is beautiful");
	}

	
	@Override
	public void food() {
		System.out.println("We all eat creatuers");
		
	}
}
