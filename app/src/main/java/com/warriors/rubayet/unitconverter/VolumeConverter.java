package com.warriors.rubayet.unitconverter;

import java.text.DecimalFormat;

/**
 * Created by Rubayet on 19-Dec-15.
 */
public class VolumeConverter
{
    private String firstUnit;
    private String secondUnit;
    private double value;
    private double result;

    public VolumeConverter(String firstUnit, String secondUnit, double value)
    {
        this.firstUnit = firstUnit;
        this.secondUnit = secondUnit;
        this.value = value;
    }
    public String getResult()
    {
        if (firstUnit.equalsIgnoreCase("Litre") && secondUnit.equalsIgnoreCase("Gallon"))
        {
            result = value/3.785414;
        }
        if (firstUnit.equalsIgnoreCase("Gallon") && secondUnit.equalsIgnoreCase("Litre"))
        {
            result = value*3.78541;
        }
        if (firstUnit.equalsIgnoreCase("Litre") && secondUnit.equalsIgnoreCase("Litre"))
        {
            result = value;
        }
        if (firstUnit.equalsIgnoreCase("Gallon") && secondUnit.equalsIgnoreCase("Gallon"))
        {
            result = value;
        }
        String finalResult;
        DecimalFormat df = new DecimalFormat("#.####");
        finalResult = df.format(result);
        return finalResult;
    }
}
