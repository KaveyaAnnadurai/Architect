package com.m2p;

public class Length {

    private static class Unit {
        static final Unit cm = new Unit(0.01);
        static final Unit m = new Unit(1);
        static final Unit km = new Unit(1000);
        private double baseFactor;


        private Unit(double baseFactor) {
            this.baseFactor = baseFactor;
        }


    }

    private double magnitude;
    private final Unit unit;

    public Length(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public static Length meter(double meterMagnitude) {
        return new Length(meterMagnitude, Unit.m);
    }

    public static Length centimeter(double magnitude) {
        return new Length(magnitude, Unit.cm);
    }

    public static Length kilometer(double kmMagnitude) {
        return new Length(kmMagnitude, Unit.km);
    }

    private double convertToBaseUnit() {
        return magnitude * (unit.baseFactor);
    }


    public Length plus(Length lengthToBeAdded) {
        Unit unitOfLengthToBeAdded = lengthToBeAdded.unit;
        double baseFactorOfLengthToBeAdded = unitOfLengthToBeAdded.baseFactor;

        double magnitudeToBeAdded = 0;
        //cm to m
        if(baseFactorOfLengthToBeAdded == 0.01 && this.unit.baseFactor == 1)
            magnitudeToBeAdded = lengthToBeAdded.magnitude/100;
        //km to cm
        else if(baseFactorOfLengthToBeAdded == 1000 && this.unit.baseFactor == 0.01)
            magnitudeToBeAdded = lengthToBeAdded.magnitude *100000;

        return new Length(magnitude + magnitudeToBeAdded, unit);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object.getClass() == getClass()) {

            Length that = (Length) object;
            if (that.convertToBaseUnit() == convertToBaseUnit())
                return true;
            else return false;
        } else return false;
    }


//    public static void main(String[] args) {
//       Length lengthToBeAdded = centimeter(100);
//        Unit u = lengthToBeAdded.unit;
//        double bf = u.baseFactor;
//        System.out.println(unit.baseFactor);
//        System.out.println(bf);
//    }
}