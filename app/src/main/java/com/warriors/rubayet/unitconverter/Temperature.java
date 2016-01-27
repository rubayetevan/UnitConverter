package com.warriors.rubayet.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Temperature extends AppCompatActivity
{
    String firstTemperatureUnit;
    String secondTemperatureUnit;
    double value;

    TextView showTemperatureTV;
    EditText getTemperatureValueET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        showTemperatureTV = (TextView) findViewById(R.id.showTemperatureResultTV);
        getTemperatureValueET = (EditText) findViewById(R.id.getTemperatureValueET);
        FirstTemperatureSpinner();
        SecondTemperatureSpinner();
    }
    public  void FirstTemperatureSpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.first_temperature_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.temperature_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                firstTemperatureUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public  void SecondTemperatureSpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.second_temperature_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.temperature_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                secondTemperatureUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void ConvertTemperature(View view)
    {
        String tempValue = getTemperatureValueET.getText().toString();
        if (tempValue.matches("")|| tempValue.equalsIgnoreCase("."))
        {
            Toast.makeText(this, "Please Enter a Value in the Box then click CONVERT Button", Toast.LENGTH_LONG).show();
        }
        else
        {
            value = Double.valueOf(tempValue);
            TemperatureConverter temperatureconverter = new TemperatureConverter(firstTemperatureUnit, secondTemperatureUnit, value);
            String finalResult = temperatureconverter.getResult();
            showTemperatureTV.setText(tempValue + " " + firstTemperatureUnit + " equals to " + finalResult + " " + secondTemperatureUnit);
        }
    }
}
