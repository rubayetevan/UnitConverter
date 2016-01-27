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

public class Volume extends AppCompatActivity
{
    String firstVolumeUnit;
    String secondVolumeUnit;
    double value;

    TextView showVolumeTV;
    EditText getVolumeValueET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        showVolumeTV = (TextView) findViewById(R.id.showVolumeResultTV);
        getVolumeValueET = (EditText) findViewById(R.id.getVolumeValueET);
        FirstVolumeSpinner();
        SecondVolumeSpinner();
    }
    public  void FirstVolumeSpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.first_volume_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.volume_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                firstVolumeUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public  void SecondVolumeSpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.second_volume_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.volume_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                secondVolumeUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void ConvertVolume(View view)
    {
        String tempValue = getVolumeValueET.getText().toString();
        if (tempValue.matches("")|| tempValue.equalsIgnoreCase("."))
        {
            Toast.makeText(this, "Please Enter a Value in the Box then click CONVERT Button", Toast.LENGTH_LONG).show();
        }
        else
        {
            value = Double.valueOf(tempValue);
            VolumeConverter volumeConverter = new VolumeConverter(firstVolumeUnit, secondVolumeUnit, value);
            String finalResult = volumeConverter.getResult();
            showVolumeTV.setText(tempValue + " " + firstVolumeUnit + " equals to " + finalResult + " " + secondVolumeUnit);
        }
    }
}
