package com.qa.main;

public class Dragon extends Animal implements SeeInDarkable, Singable {

	protected String size = "Massive";
	protected int teeth = 1000000;
	protected String tail = "Huge";
	
	
	@Override
	public void theSame() {
		System.out.println("WE ARE DRAGONS");
		
	}
	
	public void fly() {
		System.out.println("Can fly to iceland and back in 20mins");
		System.out.println(size);
		System.out.println(tail);
		System.out.println(teeth);
	}

	@Override
	public void food() {
		System.out.println("We eat everything nom");
		
	}

	@Override
	public void singLoud() {
		System.out.println("Yep whiles breathing fire");
		
	}

	@Override
	public void eyesGlow() {
		System.out.println("Granted the gift of sight");
		
	}
}
