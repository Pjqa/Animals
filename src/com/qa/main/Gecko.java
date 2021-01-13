package com.qa.main;

public class Gecko extends Lizard implements SeeInDarkable{
	
	protected String size = "Small";
	protected int teeth = 10;
	protected String tai = " Huge ";
	
	@Override
	public void theSame() {
		System.out.println("WE ARE GECKO");
	
	}
	
	public void hello() {
		System.out.println("Hello we are very " + size);
	}
	
	@Override
	public void allforOne() {
		System.out.println("Every lizard is beautiful nope just us");
	}
	
	@Override
	public void eyesGlow() {
		System.out.println("Our Red eyes allows us to see in the dark");
	}
	
	@Override
	public void food() {
		System.out.println("We eat ants");
		
	}
}
