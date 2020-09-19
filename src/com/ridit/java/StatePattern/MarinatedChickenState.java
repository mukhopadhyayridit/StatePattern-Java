package com.ridit.java.StatePattern;

public class MarinatedChickenState extends ChickenState {

	public MarinatedChickenState(Mamma mamma) {
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
		
		
	}
        

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("the chicken is getting cooked");
		
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getMamma().changeChickenState(new CookedChickenState(getMamma()));


	}

	

}
