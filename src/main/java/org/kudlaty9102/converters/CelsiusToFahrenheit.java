package org.kudlaty9102.converters;

import org.kudlaty9102.ConvertedTemperature;
import org.kudlaty9102.TemperatureUnits;

/**
 * Created by Bartek on 2015-04-27.
 */
public class CelsiusToFahrenheit extends Converter {


    public ConvertedTemperature convert(double temp) {
        return new ConvertedTemperature(TemperatureUnits.FAHRENHEIT, ((temp * 9 / 5) + 32));
    }

    public boolean accept(TemperatureUnits unit) {
        return (TemperatureUnits.CELSIUS.equals(unit));
    }
}