package com.application.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertToMiles(View view) {
        EditText editText = (EditText) findViewById(R.id.edtText);

        int kilometres = Integer.parseInt(editText.getText().toString());
        double miles = 0.62137;

        double result = kilometres * 0.62137 ;

        Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
    }
}