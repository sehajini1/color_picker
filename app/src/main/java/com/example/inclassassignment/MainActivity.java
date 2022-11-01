package com.example.inclassassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int red = 0,blue = 0,green=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText redvalue = findViewById(R.id.redvalue);
        EditText bluevalue = findViewById(R.id.bluevalue);
        EditText greenvalue = findViewById(R.id.greenvalue);
        Button generate = findViewById(R.id.generate);
        LinearLayout layout = findViewById(R.id.layout);


        generate.setOnClickListener(view -> {
            red = Integer.parseInt(redvalue.getText().toString());
            blue = Integer.parseInt(bluevalue.getText().toString());
            green = Integer.parseInt(greenvalue.getText().toString());

            int color = Color.argb(255,red,green,blue);
            if(red < 0 || red > 255 || blue < 0 || blue > 255 || green < 0 || green > 255){
                Toast.makeText(MainActivity.this,"Invalid number. Enter valid value",Toast.LENGTH_LONG).show();
                return;
            }
            layout.setBackgroundColor(color);
        });
    }
}