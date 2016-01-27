package com.warriors.rubayet.unitconverter;

import java.text.DecimalFormat;

/**
 * Created by Rubayet on 18-Dec-15.
 */
public class CurrencyConverter
{
    private String firstCurrencyUnit;
    private String secondCurrencyUnit;
    private double value;
    private String finalResult;
    private double result;

    public CurrencyConverter(String firstCurrencyUnit, String secondCurrencyUnit, double value)
    {
        this.firstCurrencyUnit = firstCurrencyUnit;
        this.secondCurrencyUnit = secondCurrencyUnit;
        this.value = value;
    }
    public String getResult()
    {
        if (firstCurrencyUnit.equalsIgnoreCase("Taka") && secondCurrencyUnit.equalsIgnoreCase("Rupi"))
        {
            result = value/1.18;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("Taka") && secondCurrencyUnit.equalsIgnoreCase("pound"))
        {
            result = value/116.47;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("Taka") && secondCurrencyUnit.equalsIgnoreCase("usd"))
        {
            result = value/78.18;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("Taka") && secondCurrencyUnit.equalsIgnoreCase("taka"))
        {
            result = value;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("usd") && secondCurrencyUnit.equalsIgnoreCase("taka"))
        {
            result = value*78.18;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("usd") && secondCurrencyUnit.equalsIgnoreCase("rupi"))
        {
            result = value*66.24;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("usd") && secondCurrencyUnit.equalsIgnoreCase("pound"))
        {
            result = value/1.49;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("usd") && secondCurrencyUnit.equalsIgnoreCase("usd"))
        {
            result = value;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("rupi") && secondCurrencyUnit.equalsIgnoreCase("taka"))
        {
            result = value*1.18;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("rupi") && secondCurrencyUnit.equalsIgnoreCase("usd"))
        {
            result = value/66.24;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("rupi") && secondCurrencyUnit.equalsIgnoreCase("pound"))
        {
            result = value/98.71;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("rupi") && secondCurrencyUnit.equalsIgnoreCase("rupi"))
        {
            result = value;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("pound") && secondCurrencyUnit.equalsIgnoreCase("taka"))
        {
            result = value*116.47;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("pound") && secondCurrencyUnit.equalsIgnoreCase("rupi"))
        {
            result = value*98.71;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("pound") && secondCurrencyUnit.equalsIgnoreCase("usd"))
        {
            result = value*1.49;
        }
        else if (firstCurrencyUnit.equalsIgnoreCase("pound") && secondCurrencyUnit.equalsIgnoreCase("pound"))
        {
            result = value;
        }
        DecimalFormat df = new DecimalFormat("#.####");
        finalResult = df.format(result);
        return finalResult;
    }


}
