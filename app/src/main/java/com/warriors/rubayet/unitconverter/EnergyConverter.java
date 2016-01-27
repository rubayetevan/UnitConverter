package com.warriors.rubayet.unitconverter;

import java.text.DecimalFormat;

/**
 * Created by Rubayet on 19-Dec-15.
 */
public class EnergyConverter
{
    private String firstUnit;
    private String secondUnit;
    private double value;
    private String finalResult;
    private double result;

    public EnergyConverter(String firstUnit, String secondUnit, double value)
    {
        this.firstUnit = firstUnit;
        this.secondUnit = secondUnit;
        this.value = value;
    }
    public String getResult()
    {
        if (firstUnit.equalsIgnoreCase("Gram calorie") && secondUnit.equalsIgnoreCase("Joule"))
        {
            result = value*4.184;
        }
        if (firstUnit.equalsIgnoreCase("Joule") && secondUnit.equalsIgnoreCase("Gram calorie"))
        {
            result = value/4.184;
        }
        if (firstUnit.equalsIgnoreCase("Gram calorie") && secondUnit.equalsIgnoreCase("Gram calorie"))
        {
            result = value;
        }
        if (firstUnit.equalsIgnoreCase("Joule") && secondUnit.equalsIgnoreCase("Joule"))
        {
            result = value;
        }

        DecimalFormat df = new DecimalFormat("#.####");
        finalResult = df.format(result);
        return finalResult;
    }

}
