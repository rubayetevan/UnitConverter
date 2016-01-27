package com.warriors.rubayet.unitconverter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Currency extends AppCompatActivity
{
    String firstCurrencyUnit;
    String secondCurrencyUnit;
    double value;

    TextView showResultTV;
    EditText getValueET;
    Button convertButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        showResultTV = (TextView) findViewById(R.id.showResultTV);
        getValueET = (EditText) findViewById(R.id.getValueET);
        convertButton = (Button) findViewById(R.id.convertButton);
        Toast.makeText(this,"Conversion will be done considering the Currency exchange rate at 18/12/2015",Toast.LENGTH_LONG).show();

        FirstCurrencySpinner();
        SecondCurrencySpinner();
    }

    public  void FirstCurrencySpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.first_currency_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.currency_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                firstCurrencyUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public  void SecondCurrencySpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.second_currency_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.currency_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                secondCurrencyUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void Convert(View view)
    {
        String tempValue = getValueET.getText().toString();
        if (tempValue.matches("") || tempValue.equalsIgnoreCase("."))
        {
            Toast.makeText(this,"Please Enter a Value in the Box then click CONVERT Button",Toast.LENGTH_LONG).show();
        }
        else
        {
            value = Double.valueOf(tempValue);
            String initialValue = String.valueOf(value);

            CurrencyConverter currencyConverter = new CurrencyConverter(firstCurrencyUnit, secondCurrencyUnit, value);
            String finalResult = currencyConverter.getResult();
            showResultTV.setText(initialValue + " " + firstCurrencyUnit + " equals to " + finalResult + " " + secondCurrencyUnit);
        }
    }
}
