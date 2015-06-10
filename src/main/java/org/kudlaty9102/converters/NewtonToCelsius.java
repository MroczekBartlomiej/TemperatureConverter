package org.kudlaty9102.converters;

import org.kudlaty9102.ConvertedTemperature;
import org.kudlaty9102.TemperatureUnits;

/**
 * Created by Bartek on 2015-06-01.
 */
public class NewtonToCelsius extends Converter {
    @Override
    public ConvertedTemperature convert(double temp) {
        return new ConvertedTemperature(TemperatureUnits.CELSIUS, (temp*100/33 ));
    }

    @Override
    public boolean accept(TemperatureUnits unit) {
        return (TemperatureUnits.NEWTON.equals(unit));
    }
}
