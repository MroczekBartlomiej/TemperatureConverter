package org.kudlaty9102.converters;

import org.kudlaty9102.ConvertedTemperature;
import org.kudlaty9102.TemperatureUnits;

/**
 * Created by Bartek on 2015-04-27.
 */
public class FahrenheitToCelsius extends Converter {

    public ConvertedTemperature convert(double temp) {
        return new ConvertedTemperature(TemperatureUnits.CELSIUS, (temp - 32) * 5 / 9);
    }

    public boolean accept(TemperatureUnits unit) {
        return (TemperatureUnits.FAHRENHEIT.equals(unit));
    }


}
