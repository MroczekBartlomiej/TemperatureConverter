package org.kudlaty9102.factories;

import org.kudlaty9102.ConvertedTemperature;
import org.kudlaty9102.converters.Converter;
import org.kudlaty9102.TemperatureUnits;

/**
 * Created by Bartek on 2015-06-01.
 */
public class ConverterFactory {

    Converter next;

    public ConvertedTemperature convert(TemperatureUnits unit, double value) {
        Converter converter = new Converter() {
            @Override
            public ConvertedTemperature convert(double temp) {
                return null;
            }

            @Override
            public boolean accept(TemperatureUnits unit) {
                return false;
            }
        };
        converter.setNext(next);
        return converter.convert(unit, value);
    }

    public void setNext(Converter next) {
        this.next = next;
    }
}
