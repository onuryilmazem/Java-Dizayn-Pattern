package com.mustafaergan.mysoftwarecompany;

public class ITUzmaniBerkay extends ITUzmani {
	public ITUzmaniBerkay() {
		setKodYazabilme(new DevJunior());
		setTestEdebilme(new TestEdemezki());
	}
	public void display() {
		System.out.println("Ben Berkay...");
	}
}
