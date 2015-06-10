package org.kudlaty9102.factories;

import org.kudlaty9102.converters.*;

/**
 * Created by Bartek on 2015-05-01.
 */
public class TemperatureConvertersFactory {

    public Converter getInstance() {

        Converter FtoC = new FahrenheitToCelsius();
        Converter CtoF = new CelsiusToFahrenheit();
        Converter KtoC = new KelvinToCelsius();
        Converter NtoC = new NewtonToCelsius();

        FtoC.setNext(CtoF);
        CtoF.setNext(KtoC);
        KtoC.setNext(NtoC);
        return FtoC;
    }
}
