package org.kudlaty9102;

/**
 * Created by Bartek on 2015-06-01.
 */
public class Printer {
    private ConvertedTemperature temp;

    public void setTemp(ConvertedTemperature temp) {
        this.temp = temp;
    }

    public void printResult(ConvertedTemperature temp) {
        System.out.println(temp.getValue() + " " + temp.getUnit());
    }
}