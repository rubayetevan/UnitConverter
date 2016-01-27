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

public class Speed extends AppCompatActivity
{
    private String firstUnit;
    private String secondUnit;
    private double value;

    TextView showSpeedTV;
    EditText getSpeedValueET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        showSpeedTV = (TextView) findViewById(R.id.showSpeedResultTV);
        getSpeedValueET = (EditText) findViewById(R.id.getSpeedValueET);
        FirstVolumeSpinner();
        SecondVolumeSpinner();
    }
    public  void FirstVolumeSpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.first_speed_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.speed_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                firstUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public  void SecondVolumeSpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.second_speed_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.speed_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                secondUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void ConvertSpeed(View view)
    {
        String tempValue = getSpeedValueET.getText().toString();
        if (tempValue.matches("")|| tempValue.equalsIgnoreCase("."))
        {
            Toast.makeText(this, "Please Enter a Value in the Box then click CONVERT Button", Toast.LENGTH_LONG).show();
        }
        else
        {
            value = Double.valueOf(tempValue);
            SpeedConverter speedConverter = new SpeedConverter(firstUnit, secondUnit, value);
            String finalResult = speedConverter.getResult();
            showSpeedTV.setText(tempValue + " " + firstUnit + " equals to " + finalResult + " " + secondUnit);
        }
    }
}
