package org.kudlaty9102;

import org.kudlaty9102.factories.ConverterFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Bartek on 2015-05-01.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("tempConverterConfig.xml");
        ConverterFactory converter = context.getBean("converter", ConverterFactory.class);
        Printer printer = context.getBean("printer", Printer.class);

        ConvertedTemperature convertedTemperature0 = converter.convert(TemperatureUnits.NEWTON, 20);
        ConvertedTemperature convertedTemperature1 = converter.convert(TemperatureUnits.KELVIN, 20);
        ConvertedTemperature convertedTemperature2 = converter.convert(TemperatureUnits.FAHRENHEIT, 20);
        printer.printResult(convertedTemperature0);
        printer.printResult(convertedTemperature1);
        printer.printResult(convertedTemperature2);

    }
}
