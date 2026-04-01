package com.quantity.measurement.enums;

public enum LengthUnit {

    INCHES(1.0),           // base unit
    FEET(12.0),            // 1 foot = 12 inches
    YARDS(36.0),           // 1 yard = 36 inches
    CENTIMETERS(0.393701); // 1 cm = 0.393701 inches

    private final double toFeetFactor;

    LengthUnit(double toFeetFactor) {
        this.toFeetFactor = toFeetFactor;
    }

    public double toBase(double value) {
        return value * toFeetFactor;
    }
}