package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onConvertClick(View view) {
        EditText dollarsField = (EditText)findViewById(R.id.editText);

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("value", dollarsField.getText().toString());
        startActivity(intent);
    }
}
