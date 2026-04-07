package com.quantity.measurement.model;

import com.quantity.measurement.enums.LengthUnit;

public class QuantityLength {

    private static final double EPSILON = 0.0001;

    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        if (unit == null)
            throw new IllegalArgumentException("Unit cannot be null");

        this.value = value;
        this.unit = unit;
    }

    public double toConvert(LengthUnit targetUnit) {
        return convert(this.value, this.unit, targetUnit);
    }

    public static double convert(double value, LengthUnit sourceUnit, LengthUnit targetUnit) {

        if (sourceUnit == null || targetUnit == null) {
            throw new IllegalArgumentException("Units shouldn't be empty");
        }

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid numeric value!");
        }

        double baseValue = sourceUnit.toBase(value);
        return targetUnit.fromBase(baseValue);
    }

    public QuantityLength add(QuantityLength other) {

        if (other == null) {
            throw new IllegalArgumentException();
        }

        if (!Double.isFinite(other.value)) {
            throw new IllegalArgumentException();
        }

        double thisInFeet = QuantityLength.convert(this.value, this.unit, LengthUnit.FEET);
        double otherInFeet = QuantityLength.convert(other.value, other.unit, LengthUnit.FEET);


        double sumInFeet = thisInFeet + otherInFeet;

        double result = QuantityLength.convert(sumInFeet, LengthUnit.FEET, this.unit);

        return new QuantityLength(result, this.unit);
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        QuantityLength other = (QuantityLength) obj;

        double thisInBase = this.unit.toBase(this.value);
        double otherInBase = other.unit.toBase(other.value);

        return Math.abs(thisInBase - otherInBase) < EPSILON;
    }
    public void add(double value, LengthUnit unit) {
        if (unit == null)
            throw new IllegalArgumentException("Unit cannot be null");
    }

    public double getValue() {
        return value;
    }
    public LengthUnit getUnit() {
        return unit;
    }
}