package com.example.higherorlowerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void guessFunction(View view){
        Log.i("Info", "Button is clicked!");

        EditText et_guess = (EditText) findViewById(R.id.et_guess);
        String currentGuess = et_guess.getText().toString();
        int currentGuessNumber = (int) Double.parseDouble(currentGuess);
        Log.i("Guessed Number", String.valueOf(currentGuessNumber));

        if (currentGuessNumber == 13){
            Toast.makeText(this, "You got it!", Toast.LENGTH_SHORT).show();
        } else if (currentGuessNumber > 13){
            Toast.makeText(this, "Guess lower", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Guess higher", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
