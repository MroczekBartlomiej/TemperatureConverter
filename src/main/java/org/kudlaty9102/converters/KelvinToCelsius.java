package org.kudlaty9102.converters;

import org.kudlaty9102.ConvertedTemperature;
import org.kudlaty9102.TemperatureUnits;

/**
 * Created by Bartek on 2015-06-01.
 */
public class KelvinToCelsius extends Converter {
    @Override
    public ConvertedTemperature convert(double temp) {
        return new ConvertedTemperature(TemperatureUnits.CELSIUS, (temp - 273.15));
    }

    @Override
    public boolean accept(TemperatureUnits unit) {
        return (TemperatureUnits.KELVIN.equals(unit));
    }
}
