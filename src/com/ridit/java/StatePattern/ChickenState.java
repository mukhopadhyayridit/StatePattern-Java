package com.ridit.java.StatePattern;

public abstract class ChickenState {
private Mamma mamma;
	
	public ChickenState(Mamma mamma) {
		this.setMamma(mamma);	
	} 
	public abstract void wash();
	public abstract void marionate();
	public abstract void cook();

	public Mamma getMamma() {
		return mamma;
	}

	public void setMamma(Mamma mamma) {
		this.mamma = mamma;
	}

}
