package com.example.handsonactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.view.TextureView;
import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText Et1,Et2;
    private TextView TextV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 = findViewById(R.id.ETswap);
        EditText editText2 = findViewById(R.id.ETcheck);
        Button buttonSwap = findViewById(R.id.btnSwap);
        Button buttonCompare = findViewById(R.id.btnCheck);
        TextV = findViewById(R.id.TV);

        buttonSwap.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String temp = editText1.getText().toString();
                editText1.setText(editText2.getText().toString());
                editText2.setText(temp);
            }
        });
        buttonCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().toString().equals(editText2.getText().toString())) {
                    TextV.setText("SAME");
                } else {
                    TextV.setText("NOT THE SAME");
                }
            }
        });
    }

    }
