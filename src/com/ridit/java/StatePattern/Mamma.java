package com.ridit.java.StatePattern;

public class Mamma {

private ChickenState chicken;
	
	public Mamma() {
		chicken = new UncleanedChicken(this);
	}

	public ChickenState getChickenState() {
		return chicken;
	}

	public void changeChickenState(ChickenState chicken) {
		this.chicken = chicken;
	}
	
	public void startPreparation() {
		chicken.wash();
		chicken.marionate();
		chicken.cook();
	}


}
