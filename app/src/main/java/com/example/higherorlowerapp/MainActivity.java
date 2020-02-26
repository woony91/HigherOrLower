package com.example.higherorlowerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void guessFunction(View view) {
        Log.i("Info", Integer.toString(randomNumber));

        EditText et_guess = (EditText) findViewById(R.id.et_guess);
        int currentGuessNumber = (int) Double.parseDouble(et_guess.getText().toString());
        Log.i("Guessed Number", String.valueOf(currentGuessNumber));
        String message;

        if (currentGuessNumber == randomNumber) {
            message = "You got it!";
        } else if (currentGuessNumber > randomNumber) {
            message = "Lower";
        } else {
            message = "higher";
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;
    }
}
