package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv = (TextView)findViewById(R.id.textView3);
        Intent intent = getIntent();
        String str = intent.getStringExtra("value");
        double pounds = Integer.parseInt(str) * 0.77;
        tv.setText(Double.toString(pounds) + " Pounds");
    }
}
