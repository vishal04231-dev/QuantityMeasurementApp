package com.quantity.measurement.model;

import com.quantity.measurement.enums.LengthUnit;

public class QuantityLength {

<<<<<<< HEAD
=======
    private static final double EPSILON = 1e-6;

>>>>>>> 93060f024d78db26001dfa91e13f978033fe7c5f
    private final double value;
    private final LengthUnit unit;
    private final double EPSILON = 1e-6;

    // Constructor
    public QuantityLength(double value, LengthUnit unit) {
        if (unit == null) {
<<<<<<< HEAD
            throw new IllegalArgumentException("unit can not null ");
        }
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid numeric value");
        }
=======
            throw new IllegalArgumentException("Unit should not be null");
        }

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }

>>>>>>> 93060f024d78db26001dfa91e13f978033fe7c5f
        this.value = value;
        this.unit = unit;
    }

<<<<<<< HEAD
    public double toFeet() {
        return unit.convertToBaseUnit(value);
    }

    public double toConvert(LengthUnit targetUnit) {
        return convert(this.value, this.unit, targetUnit);
    }

    public static double convert(double value, LengthUnit sourceUnit, LengthUnit targetUnit) {
        if (sourceUnit == null || targetUnit == null) {
            throw new IllegalArgumentException("Source/Target unit cannot be null");
        }
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invaild numric value!!");
        }

        double valueInFeet = sourceUnit.convertToBaseUnit(value);
        return targetUnit.convertFromBaseUnit(valueInFeet);
    }

=======
    // Getters
    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
    }

    // ========================
    // ADD with target unit (UC7)
    // ========================
    public QuantityLength add(QuantityLength other, LengthUnit targetUnit) {

        if (other == null || targetUnit == null) {
            throw new IllegalArgumentException("Other quantity and target unit must not be null");
        }

        if (!Double.isFinite(other.value)) {
            throw new IllegalArgumentException("Invalid value in other quantity");
        }

        double thisInFeet = this.unit.convertToBaseUnit(this.value);
        double otherInFeet = other.unit.convertToBaseUnit(other.value);

        double sumInFeet = thisInFeet + otherInFeet;

        double result = targetUnit.convertFromBaseUnit(sumInFeet);

        return new QuantityLength(result, targetUnit);
    }

    // ========================
    // ADD (UC6)
    // ========================
    public QuantityLength add(QuantityLength other) {
        return add(other, this.unit);
    }

    // ========================
    // CONVERT (UC5 / UC8)
    // Original -> Feet(Base) -> TargetUnit
    // ========================
    public QuantityLength toConvert(LengthUnit targetUnit) {
        if (targetUnit == null) {
            throw new IllegalArgumentException("target Unit should not null");
        }

        double thisInFeet = unit.convertToBaseUnit(this.value);
        double targetValue = targetUnit.convertFromBaseUnit(thisInFeet);

        return new QuantityLength(targetValue, targetUnit);
    }

    // ========================
    // EQUALS (UC4)
    // ========================
>>>>>>> 93060f024d78db26001dfa91e13f978033fe7c5f
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof QuantityLength)) return false;

        QuantityLength other = (QuantityLength) obj;

<<<<<<< HEAD
        double thisInFeet = this.toFeet();
        double otherInFeet = other.toFeet();

        return Math.abs(thisInFeet - otherInFeet) < EPSILON;
    }


    public QuantityLength add(QuantityLength other, LengthUnit targetUnit) {
        if (other == null || targetUnit == null) {
            throw new IllegalArgumentException("Second quantity and targetUnit must not be null");
        }
        if (!Double.isFinite(other.value)) {
            throw new IllegalArgumentException("Invalid numeric value");
        }

        double sumInFeet = this.toFeet() + other.toFeet();
        double resultValue = targetUnit.convertFromBaseUnit(sumInFeet);

        return new QuantityLength(resultValue, targetUnit);
    }

    public QuantityLength add(QuantityLength other) {
        return add(other, this.unit);
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return value + " " + unit.name();
    }
}
=======
        double thisInFeet = this.unit.convertToBaseUnit(this.value);
        double otherInFeet = other.unit.convertToBaseUnit(other.value);

        return Math.abs(thisInFeet - otherInFeet) < EPSILON;
    }
}
>>>>>>> 93060f024d78db26001dfa91e13f978033fe7c5f
