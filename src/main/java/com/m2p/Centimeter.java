package com.m2p;

public class Centimeter {
    private double magnitude;

    public Centimeter(double magnitude) {
        this.magnitude = magnitude;
    }
    public static Centimeter createMeter(double meterMagnitude){
        return new Centimeter(meterMagnitude*100);
    }
    public static Centimeter createKiloMeter(double kmMagnitude){
        return new Centimeter(kmMagnitude*10000);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

            if(object.getClass() == getClass()) {

                Centimeter that = (Centimeter) object;
                if (that.magnitude == magnitude)
                    return true;
                else return false;
            }
            else return false;
        }

    }


