package com.warriors.rubayet.unitconverter;

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

public class Length extends AppCompatActivity
{
    String firstLengthUnit;
    String secondLengthUnit;
    double value;

    TextView showLengthResultTV;
    EditText getLengthValueET;
    Button lengthConvertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        showLengthResultTV = (TextView) findViewById(R.id.showLengthResultTV);
        getLengthValueET = (EditText) findViewById(R.id.getLengthValueET);
        lengthConvertButton = (Button) findViewById(R.id.lengthConvertButton);

        FirstLengthSpinner();
        SecondLengthSpinner();
    }

    public  void FirstLengthSpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.first_length_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.length_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                firstLengthUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public  void SecondLengthSpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.second_length_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.length_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                secondLengthUnit = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void ConvertLength(View view)
    {
        String tempValue = getLengthValueET.getText().toString();
        if (tempValue.matches("")|| tempValue.equalsIgnoreCase("."))
        {
            Toast.makeText(this, "Please Enter a Value in the Box then click CONVERT Button", Toast.LENGTH_LONG).show();
        }
        else
        {
            value = Double.valueOf(tempValue);
            LengthConverter lengthConverter = new LengthConverter(firstLengthUnit, secondLengthUnit, value);
            String finalResult = lengthConverter.getResult();
            showLengthResultTV.setText(tempValue + " " + firstLengthUnit + " equals to " + finalResult + " " + secondLengthUnit);
        }
    }
}
