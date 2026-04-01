package com.quantity.measurement.enums;

public enum LengthUnit {

    INCHES(1.0),           
    FEET(12.0),            
    YARDS(36.0),           
    CENTIMETERS(0.393701); 

    private final double toFeetFactor;

    LengthUnit(double toFeetFactor) {
        this.toFeetFactor = toFeetFactor;
    }

    public double toBase(double value) {
        return value * toFeetFactor;
    }
}
