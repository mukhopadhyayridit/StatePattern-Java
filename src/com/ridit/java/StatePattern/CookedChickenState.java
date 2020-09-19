package com.ridit.java.StatePattern;

public class CookedChickenState extends ChickenState {

	public CookedChickenState(Mamma mamma) {
		super(mamma);
		// TODO Auto-generated constructor stub
		System.out.println("chicken is prepared enjoy your food");
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

	}

}
