package com.netcracker.beans;

public class Car {

    private IEngen iEngen;
    private String vin;

   /* public Car(IEngen iEngen,String vin) {
        this.iEngen = iEngen;
        this.vin=vin;
    }*/

    public void setiEngen(IEngen iEngen) {
        this.iEngen = iEngen;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public IEngen getiEngen() {
        return iEngen;
    }

    public String getVin() {
        return vin;
    }
}
