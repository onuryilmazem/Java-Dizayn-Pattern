package com.mustafaergan.cars;

public class SatisBayi {
    BursaFabrikasi factory;

    public SatisBayi(BursaFabrikasi factory) {

        this.factory = factory;
    }

    public Araba arabaSiparisEt(String type) {
        Araba araba;

        araba = factory.arabaUret(type);

        araba.krediIslemleri();
        araba.sigortaIslemleri();
        araba.plakaIslemleri();
        araba.teslimIslemleri();

        return araba;
    }

}
