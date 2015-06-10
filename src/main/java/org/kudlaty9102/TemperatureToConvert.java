package org.kudlaty9102;

/**
 * Created by Bartek on 2015-05-08.
 */
public class TemperatureToConvert {
   private final double tempValue;
   private final TemperatureUnits units;


   public TemperatureToConvert(TemperatureUnits units, double tempValue) {
      this.tempValue = tempValue;
      this.units = units;
   }

   public double getTempValue() {
      return tempValue;
   }

   public TemperatureUnits getUnits() {
      return units;
   }
}
