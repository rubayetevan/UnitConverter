package com.warriors.rubayet.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void LengthOnClick(View view)
    {
        Intent intent = new Intent(MainActivity.this,Length.class);
        startActivity(intent);
    }
    public void SpeedOnClick(View view)
    {
        Intent intent = new Intent(MainActivity.this,Speed.class);
        startActivity(intent);
    }
    public void TemperatureOnClick(View view)
    {
        Intent intent = new Intent(MainActivity.this,Temperature.class);
        startActivity(intent);
    }
    public void FuelConsumptionOnClick(View view)
    {
        Intent intent = new Intent(MainActivity.this,FuelConsumption.class);
        startActivity(intent);
    }
    public void MassOnClick(View view)
    {
        Intent intent = new Intent(MainActivity.this,Mass.class);
        startActivity(intent);
    }
    public void EnergyOnClick(View view)
    {
        Intent intent = new Intent(MainActivity.this,Energy.class);
        startActivity(intent);
    }
    public void VolumeOnClick(View view)
    {
        Intent intent = new Intent(MainActivity.this,Volume.class);
        startActivity(intent);
    }
    public void PressureOnClick(View view)
    {
        Intent intent = new Intent(MainActivity.this,Pressure.class);
        startActivity(intent);
    }
    public void CurrencyOnClick(View view)
    {
        Intent intent = new Intent(MainActivity.this,Currency.class);
        startActivity(intent);
    }

}
