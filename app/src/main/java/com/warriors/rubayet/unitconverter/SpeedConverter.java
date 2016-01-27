package com.warriors.rubayet.unitconverter;

import java.text.DecimalFormat;

/**
 * Created by Rubayet on 19-Dec-15.
 */
public class SpeedConverter
{
    private String firstUnit;
    private String secondUnit;
    private double value;
    private double result;

    public SpeedConverter(String firstUnit, String secondUnit, double value)
    {
        this.firstUnit = firstUnit;
        this.secondUnit = secondUnit;
        this.value = value;
    }
    public String getResult()
    {
        if (firstUnit.equalsIgnoreCase("Kilometre per hour") && secondUnit.equalsIgnoreCase("Miles per hour"))
        {
            result = value/1.60934;
        }
        if (firstUnit.equalsIgnoreCase("Miles per hour") && secondUnit.equalsIgnoreCase("Kilometre per hour"))
        {
            result = value*1.60934;
        }
        if (firstUnit.equalsIgnoreCase("Miles per hour") && secondUnit.equalsIgnoreCase("Miles per hour"))
        {
            result = value;
        }
        if (firstUnit.equalsIgnoreCase("Kilometre per hour") && secondUnit.equalsIgnoreCase("Kilometre per hour"))
        {
            result = value;
        }
        String finalResult;
        DecimalFormat df = new DecimalFormat("#.####");
        finalResult = df.format(result);
        return finalResult;
    }
}
