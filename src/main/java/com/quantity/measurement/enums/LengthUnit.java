package com.quantity.measurement.enums;

public enum LengthUnit {
<<<<<<< HEAD
<<<<<<< HEAD
    FEET(1.0),
    INCH(1.0 / 12.0),
    YARD(3.0),
    CM(0.0328084);
=======

    INCHES(1.0),           
    FEET(12.0),            
    YARDS(36.0),           
    CENTIMETERS(0.393701); 
>>>>>>> 0c6dbf0fddb76d4017a4f03ef5858e30a854c8f4

    private final double toFeetFactor;

=======
    FEET(1.0),
    INCH(1.0 / 12.0),
    YARDS(3.0),
    CENTIMETERS(0.0328084);

    private final double toFeetFactor;

>>>>>>> 93060f024d78db26001dfa91e13f978033fe7c5f
    LengthUnit(double toFeetFactor) {
        this.toFeetFactor = toFeetFactor;
    }

    public double getConversionFactor() {
        return this.toFeetFactor;
    }

    public double convertToBaseUnit(double value) {
        return value * toFeetFactor;
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 93060f024d78db26001dfa91e13f978033fe7c5f

    public double convertFromBaseUnit(double feetValue) {
        return feetValue / toFeetFactor;
    }

    public double toFeet(double value) {
        return convertToBaseUnit(value);
    }

    public double fromFeet(double value) {
        return convertFromBaseUnit(value);
    }

    public double toBase(double value) {
        return convertToBaseUnit(value);
    }

    public double fromBase(double value) {
        return convertFromBaseUnit(value);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 0c6dbf0fddb76d4017a4f03ef5858e30a854c8f4
=======

}
>>>>>>> 93060f024d78db26001dfa91e13f978033fe7c5f
