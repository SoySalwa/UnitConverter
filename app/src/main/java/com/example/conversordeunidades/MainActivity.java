package com.example.conversordeunidades;

import androidx.appcompat.app.AppCompatActivity;
import com.example.conversordeunidades.databinding.ActivityMainBinding;

import android.annotation.SuppressLint;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    boolean convert_process = true;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }


    public void unitConvert() {
        try {
            String inputText = binding.textEdit.getText().toString();

            float kgValue = Float.parseFloat(inputText);

            float lbValue = kgValue * 2.20462f;

            @SuppressLint("DefaultLocale") String resultText = String.format("%.2f libras", lbValue);
            binding.viewText.setText(resultText);

        } catch (NumberFormatException e) {
            e.printStackTrace();
            convert_process = false;
        }
    }

    public void buttonConvert(View view) {
        if (convert_process) {
            unitConvert();
        }
    }
}