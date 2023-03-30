package com.m2p;

public class Length {

    private static class Unit{
        static final Unit cm = new Unit(0.01);
        static final Unit m = new Unit(1);
        static final Unit km = new Unit(1000);
        private double baseFactor;
        private Unit(double baseFactor){
            this.baseFactor = baseFactor;
        }

    }
    private double magnitude;
    private final Unit unit;

    public Length(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }
    public static Length meter(double meterMagnitude){
        return new Length(meterMagnitude, Unit.m);
    }
    public static Length centimeter(double magnitude)
    {
        return new Length(magnitude, Unit.cm);
    }

    public static Length kilometer(double kmMagnitude){
        return new Length(kmMagnitude, Unit.km);
    }
    private double convertToBaseUnit()
    {
        return magnitude * (unit.baseFactor);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

            if(object.getClass() == getClass()) {

                Length that = (Length) object;
                if (that.convertToBaseUnit() == convertToBaseUnit())
                    return true;
                else return false;
            }
            else return false;
        }
}


