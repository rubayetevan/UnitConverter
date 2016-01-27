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

public class Mass extends AppCompatActivity
{
    String firstMassUnit;
    String secondMassUnit;
    double value;

    TextView showMassTV;
    EditText getMassValueET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        showMassTV = (TextView) findViewById(R.id.showMassResultTV);
        getMassValueET = (EditText) findViewById(R.id.getMassValueET);
        FirstTemperatureSpinner();
        SecondTemperatureSpinner();
    }
    public  void FirstTemperatureSpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.first_mass_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.mass_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                firstMassUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public  void SecondTemperatureSpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.second_mass_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.mass_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                secondMassUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void ConvertMass(View view)
    {
        String tempValue = getMassValueET.getText().toString();
        if (tempValue.matches("")|| tempValue.equalsIgnoreCase("."))
        {
            Toast.makeText(this, "Please Enter a Value in the Box then click CONVERT Button", Toast.LENGTH_LONG).show();
        }
        else
        {
            value = Double.valueOf(tempValue);
            MassConverter massconverter = new MassConverter(firstMassUnit,secondMassUnit,value);
            String finalResult = massconverter.getResult();
            showMassTV.setText(tempValue + " " + firstMassUnit + " equals to " + finalResult + " " + secondMassUnit);
        }
    }
}
