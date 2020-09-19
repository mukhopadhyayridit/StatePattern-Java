package com.ridit.java.StatePattern;

public class UncleanedChicken extends ChickenState {

	public UncleanedChicken(Mamma mamma) {
		super(mamma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		System.out.println("Chicken is getting washed");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getMamma().changeChickenState(new WashedChicken(getMamma()));

	}



	@Override
	public void marionate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub

	}

}
