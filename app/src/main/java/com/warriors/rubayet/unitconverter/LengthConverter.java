package com.warriors.rubayet.unitconverter;

import java.text.DecimalFormat;

/**
 * Created by Rubayet on 19-Dec-15.
 */
public class LengthConverter
{
    private String firstLengthUnit;
    private String secondLengthUnit;
    private double value;
    private String finalResult;
    private double result;

    public LengthConverter(String firstLengthUnit, String secondLengthUnit, double value)
    {
        this.firstLengthUnit = firstLengthUnit;
        this.secondLengthUnit = secondLengthUnit;
        this.value = value;
    }
    public String getResult()
    {
        if (firstLengthUnit.equalsIgnoreCase("Metre") && secondLengthUnit.equalsIgnoreCase("inch"))
        {
            result = value*39.3701;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Metre") && secondLengthUnit.equalsIgnoreCase("Centimetre"))
        {
            result = value*100;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Metre") && secondLengthUnit.equalsIgnoreCase("Mile"))
        {
            result = value/1609.34;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Metre") && secondLengthUnit.equalsIgnoreCase("Foot"))
        {
            result = value*3.28084;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Metre") && secondLengthUnit.equalsIgnoreCase("Metre"))
        {
            result = value;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Inch") && secondLengthUnit.equalsIgnoreCase("Metre"))
        {
            result = value/39.3701;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Inch") && secondLengthUnit.equalsIgnoreCase("Centimetre"))
        {
            result = value*2.54;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Inch") && secondLengthUnit.equalsIgnoreCase("Mile"))
        {
            result = value/63360;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Inch") && secondLengthUnit.equalsIgnoreCase("Foot"))
        {
            result = value/12;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Inch") && secondLengthUnit.equalsIgnoreCase("Inch"))
        {
            result = value;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Centimetre") && secondLengthUnit.equalsIgnoreCase("Metre"))
        {
            result = value/100;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Centimetre") && secondLengthUnit.equalsIgnoreCase("Inch"))
        {
            result = value/2.54;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Centimetre") && secondLengthUnit.equalsIgnoreCase("Mile"))
        {
            result = value/160934;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Centimetre") && secondLengthUnit.equalsIgnoreCase("Foot"))
        {
            result = value/30.48;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Centimetre") && secondLengthUnit.equalsIgnoreCase("Centimetre"))
        {
            result = value;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Mile") && secondLengthUnit.equalsIgnoreCase("Metre"))
        {
            result = value*1609.34;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Mile") && secondLengthUnit.equalsIgnoreCase("Inch"))
        {
            result = value*63360;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Mile") && secondLengthUnit.equalsIgnoreCase("Centimetre"))
        {
            result = value*160934;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Mile") && secondLengthUnit.equalsIgnoreCase("Foot"))
        {
            result = value*5280;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Mile") && secondLengthUnit.equalsIgnoreCase("Mile"))
        {
            result = value;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Foot") && secondLengthUnit.equalsIgnoreCase("Metre"))
        {
            result = value/3.28084;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Foot") && secondLengthUnit.equalsIgnoreCase("Inch"))
        {
            result = value*12;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Foot") && secondLengthUnit.equalsIgnoreCase("Centimetre"))
        {
            result = value*30.48;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Foot") && secondLengthUnit.equalsIgnoreCase("Mile"))
        {
            result = value/5280;
        }
        else if (firstLengthUnit.equalsIgnoreCase("Foot") && secondLengthUnit.equalsIgnoreCase("Foot"))
        {
            result = value;
        }
        DecimalFormat df = new DecimalFormat("#.####");
        finalResult = df.format(result);
        return finalResult;
    }
}
