package com.warriors.rubayet.unitconverter;

import java.text.DecimalFormat;

/**
 * Created by Rubayet on 19-Dec-15.
 */
public class PressureConverter
{
    private String firstUnit;
    private String secondUnit;
    private double value;
    private double result;

    public PressureConverter(String firstUnit, String secondUnit, double value)
    {
        this.firstUnit = firstUnit;
        this.secondUnit = secondUnit;
        this.value = value;
    }
    public String getResult()
    {
        if (firstUnit.equalsIgnoreCase("Bar") && secondUnit.equalsIgnoreCase("Pascal"))
        {
            result = value*100000;
        }
        if (firstUnit.equalsIgnoreCase("Pascal") && secondUnit.equalsIgnoreCase("Bar"))
        {
            result = value/100000;
        }
        if (firstUnit.equalsIgnoreCase("Pascal") && secondUnit.equalsIgnoreCase("Pascal"))
        {
            result = value;
        }
        if (firstUnit.equalsIgnoreCase("Bar") && secondUnit.equalsIgnoreCase("Bar"))
        {
            result = value;
        }
        String finalResult;
        DecimalFormat df = new DecimalFormat("#.####");
        finalResult = df.format(result);
        return finalResult;
    }

}
