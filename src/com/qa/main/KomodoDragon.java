package com.qa.main;

public class KomodoDragon extends Lizard implements Singable {
	
	protected String size = "Large";
	protected int teeth = 300;
	protected String tail = "Long";
	
	@Override
	public void theSame() {
		System.out.println("WE ARE KOMODO DRAGONS");
	
	}
	
	public void run() {
		System.out.println(" Can run very fast and i have " + teeth + "teeth");
	}
	
	@Override
	public void allforOne() {
		System.out.println("Every lizard is beautiful not us :(");
	}
	
	@Override
	public void singLoud() {
		System.out.println(" La la LA LA LA LAAAAAA");
	}
		
	@Override
	public void food() {
		System.out.println("We eat Rats");
		
	}
}
