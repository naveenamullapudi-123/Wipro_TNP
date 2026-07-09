package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

    public String getModelName() {
        return "Logan";
    }

    public String getRegistrationNumber() {
        return "AP39AB1111";
    }

    public String getOwnerName() {
        return "Naveena";
    }

    public int speed() {
        return 100;
    }

    public void gps() {
        System.out.println("GPS is ON");
    }
}