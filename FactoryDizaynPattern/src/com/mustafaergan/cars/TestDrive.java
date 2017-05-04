package com.mustafaergan.cars;

public class TestDrive {
 
	public static void main(String[] args) {
		BursaFabrikasi factory = new BursaFabrikasi();
		SatisBayi store = new SatisBayi(factory);

		Araba araba = store.arabaSiparisEt("auris");
		System.out.println("Siparis teslim edildi : " + araba.getName() + "\n");
		System.out.println(araba);
 
		araba = store.arabaSiparisEt("yaris");
		System.out.println("Siparis teslim edildi : " + araba.getName() + "\n");
		System.out.println(araba);
	}
}
