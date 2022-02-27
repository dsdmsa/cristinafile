package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

   int randomNum;

   public void makeToast(String string) {
       Toast.makeText(this, string, Toast.LENGTH_SHORT).show();

   }

    public void guessNumber(View button) {
        EditText inputNumber = (EditText) findViewById(R.id.number);
        Integer number = Integer.parseInt(inputNumber.getText().toString());

        if (randomNum < number) {
            makeToast("Lower!");
        } else if (randomNum > number) {
            makeToast("Higher!");
        } else {
            makeToast("That's right! Try again!");
            randomNum = new Random().nextInt(19) + 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomNum = new Random().nextInt(19) + 1;
    }
}