package com.m2p;

public class Centimeter {
    private double magnitude;

    public Centimeter(double magnitude) {
        this.magnitude = magnitude;
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


