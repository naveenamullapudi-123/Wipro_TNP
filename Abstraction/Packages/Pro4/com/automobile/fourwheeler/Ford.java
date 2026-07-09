package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    public String getModelName() {
        return "Ford EcoSport";
    }

    public String getRegistrationNumber() {
        return "AP39CD2222";
    }

    public String getOwnerName() {
        return "Naveena";
    }

    public int speed() {
        return 120;
    }

    public void tempControl() {
        System.out.println("Air Conditioner is ON");
    }
}