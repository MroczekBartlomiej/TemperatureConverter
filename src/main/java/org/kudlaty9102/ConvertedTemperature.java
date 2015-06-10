package org.kudlaty9102;

/**
 * Created by Bartek on 2015-04-27.
 */
public final class ConvertedTemperature {
    private final TemperatureUnits unit;
    private final double value;


    public ConvertedTemperature(TemperatureUnits unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public TemperatureUnits getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }
}
