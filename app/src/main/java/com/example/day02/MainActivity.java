package com.example.day02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvResult, tvLength, tvWidth, tvHeight;
    private EditText  etLength, etWidth, etHeight;
    private Button btnCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi

        etLength = findViewById(R.id.etLength);
        etWidth = findViewById(R.id.etWidth);
        etHeight = findViewById(R.id.etHeight);
        tvResult = findViewById(R.id.tvResult);
        tvLength = findViewById(R.id.tvLength);
        tvWidth = findViewById(R.id.tvWidth);
        tvHeight = findViewById(R.id.tvHeight);
        btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnCalculate) {
            String inputLength = etLength.getText().toString().trim();
            String inputWidth = etWidth.getText().toString().trim();
            String inputHeight = etHeight.getText().toString().trim();

            tvHeight.setText(inputHeight);
            tvWidth.setText(inputWidth);
            tvLength.setText(inputLength);
            double volume = Double.parseDouble(inputLength) * Double.parseDouble(inputHeight) * Double.parseDouble(inputWidth);
            Log.d("result", String.valueOf(volume));
        }
    }
}