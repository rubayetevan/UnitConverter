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

public class Energy extends AppCompatActivity
{
    String firstEnergyUnit;
    String secondEnergyUnit;
    double value;

    TextView showEnergyTV;
    EditText getEnergyValueET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy);
        showEnergyTV = (TextView) findViewById(R.id.showEnergyResultTV);
        getEnergyValueET = (EditText) findViewById(R.id.getEnergyValueET);
        FirstEnergySpinner();
        SecondEnergySpinner();
    }
    public  void FirstEnergySpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.first_energy_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.energy_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                firstEnergyUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public  void SecondEnergySpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.second_energy_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.energy_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                secondEnergyUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void ConvertEnergy(View view)
    {
        String tempValue = getEnergyValueET.getText().toString();
        if (tempValue.matches("")|| tempValue.equalsIgnoreCase("."))
        {
            Toast.makeText(this, "Please Enter a Value in the Box then click CONVERT Button", Toast.LENGTH_LONG).show();
        }
        else
        {
            value = Double.valueOf(tempValue);
            EnergyConverter energyConverter = new EnergyConverter(firstEnergyUnit, secondEnergyUnit, value);
            String finalResult = energyConverter.getResult();
            showEnergyTV.setText(tempValue + " " + firstEnergyUnit + " equals to " + finalResult + " " + secondEnergyUnit);
        }
    }
}
