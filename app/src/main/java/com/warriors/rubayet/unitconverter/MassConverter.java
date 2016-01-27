package com.warriors.rubayet.unitconverter;

import java.text.DecimalFormat;

/**
 * Created by Rubayet on 19-Dec-15.
 */
public class MassConverter
{
    private String firstUnit;
    private String secondUnit;
    private double value;
    private String finalResult;
    private double result;

    public MassConverter(String firstUnit, String secondUnit, double value)
    {
        this.firstUnit = firstUnit;
        this.secondUnit = secondUnit;
        this.value = value;
    }
    public String getResult()
    {
        if (firstUnit.equalsIgnoreCase("KG") && secondUnit.equalsIgnoreCase("Pound"))
        {
            result = value*2.20462;
        }
        if (firstUnit.equalsIgnoreCase("Pound") && secondUnit.equalsIgnoreCase("KG"))
        {
            result = value/2.20462;
        }
        if (firstUnit.equalsIgnoreCase("KG") && secondUnit.equalsIgnoreCase("KG"))
        {
            result = value;
        }
        if (firstUnit.equalsIgnoreCase("Pound") && secondUnit.equalsIgnoreCase("Pound"))
        {
            result = value;
        }

        DecimalFormat df = new DecimalFormat("#.####");
        finalResult = df.format(result);
        return finalResult;
    }
}
