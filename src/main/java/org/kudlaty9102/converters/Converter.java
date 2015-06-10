
package org.kudlaty9102.converters;

import org.kudlaty9102.ConvertedTemperature;
import org.kudlaty9102.TemperatureUnits;

/**
 * Created by Bartek on 2015-04-27.
 */

public abstract class Converter {
    public Converter() {
    }

    public Converter nextInChain;

    public ConvertedTemperature convert(TemperatureUnits unit, double temp) {
        if (accept(unit)) {
            return convert(temp);
        } else
            return nextInChain.convert(unit, temp);
    }

    public abstract ConvertedTemperature convert(double temp);

    public abstract boolean accept(TemperatureUnits unit);

    public void setNext(Converter nextInChain) {
        this.nextInChain = nextInChain;
    }
}