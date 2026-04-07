package com.quantity.measurement.enums;

public enum LengthUnit {

    INCHES(1.0),           // base unit
    FEET(12.0),            // 1 foot = 12 inches
    YARDS(36.0),           // 1 yard = 36 inches
    CM(0.393701);          // 1 cm = 0.393701 inches

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