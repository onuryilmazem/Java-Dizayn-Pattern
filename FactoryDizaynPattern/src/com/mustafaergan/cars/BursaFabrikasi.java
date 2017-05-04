package com.mustafaergan.cars;

public class BursaFabrikasi {

	public Araba arabaUret(String type) {
		Araba araba = null;

		if (type.equals("Murat131")) {
			araba = new Murat131();
		} else if (type.equals("Dogan")) {
			araba = new Dogan();
		} else if (type.equals("Sahin")) {
			araba = new Sahin();
		}
		return araba;
	}
}
