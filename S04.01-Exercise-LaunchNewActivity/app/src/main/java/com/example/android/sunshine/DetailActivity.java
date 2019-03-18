package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    private TextView mDetailWeatherTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mDetailWeatherTextView = findViewById(R.id.detail_weather_text);

        Intent currentIntent = getIntent();
        if(currentIntent.hasExtra("WeatherData")) {
            mDetailWeatherTextView.setText(currentIntent.getStringExtra("WeatherData"));
        }
    }

}
