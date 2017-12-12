package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private String weatherData;
    private TextView details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        details = (TextView) findViewById(R.id.tv_details);
        Intent intent = getIntent();
        // TODO (2) Display the weather forecast that was passed from MainActivity
        if(intent.hasExtra(Intent.EXTRA_TEXT)){
            weatherData = intent.getStringExtra(Intent.EXTRA_TEXT);
            details.setText(weatherData);
        }

    }
}