package com.ridit.java.StatePattern;


public class WashedChicken extends ChickenState {

	public WashedChicken(Mamma mamma) {
		super(mamma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void wash() {
		// TODO Auto-generated method stub

	}

	@Override
	public void marionate() {
		// TODO Auto-generated method stub
		System.out.println("Chicken is being marionated");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getMamma().changeChickenState(new MarinatedChickenState(getMamma()));

	}

	

	@Override
	public void cook() {
		// TODO Auto-generated method stub

	}

}
