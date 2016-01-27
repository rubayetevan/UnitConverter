package com.warriors.rubayet.unitconverter;

import java.text.DecimalFormat;

/**
 * Created by Rubayet on 19-Dec-15.
 */
public class TemperatureConverter
{
    private String firstUnit;
    private String secondUnit;
    private double value;
    private String finalResult;
    private double result;

    public TemperatureConverter(String firstUnit, String secondUnit, double value)
    {
        this.firstUnit = firstUnit;
        this.secondUnit = secondUnit;
        this.value = value;
    }
    public String getResult()
    {
        if (firstUnit.equalsIgnoreCase("Celsius") && secondUnit.equalsIgnoreCase("Fahrenheit"))
        {
            result = (value*1.8)+32;
        }
        if (firstUnit.equalsIgnoreCase("Fahrenheit") && secondUnit.equalsIgnoreCase("Celsius"))
        {
            result = (value-32)/1.8;
        }
        if (firstUnit.equalsIgnoreCase("Fahrenheit") && secondUnit.equalsIgnoreCase("Fahrenheit"))
        {
            result = value;
        }
        if (firstUnit.equalsIgnoreCase("Celsius") && secondUnit.equalsIgnoreCase("Celsius"))
        {
            result = value;
        }

        DecimalFormat df = new DecimalFormat("#.####");
        finalResult = df.format(result);
        return finalResult;
    }
}
