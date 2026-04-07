package com.quantity.measurement.enums;

public enum LengthUnit {

    INCHES(1.0),
    FEET(12.0),
    YARDS(36.0),
    CM(0.393701);

    private final double toBaseFactor; // base = inches

    LengthUnit(double toBaseFactor) {
        this.toBaseFactor = toBaseFactor;
    }

    // Convert any unit → base unit (inches)
    public double toBase(double value) {
        return value * toBaseFactor;
    }

    // Convert base unit (inches) → target unit
    public double fromBase(double value) {
        return value / toBaseFactor;
    }
}