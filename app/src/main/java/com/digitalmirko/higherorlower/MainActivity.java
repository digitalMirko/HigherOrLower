package com.digitalmirko.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int ranPick = ran();

    // Toast reply
    public void makeToast(String string) {

        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void btnClicked(View view) {

        // Test to see if Random Number Generator is working
        Log.i("Random Number", Integer.toString(ranPick));

        EditText numGuessEditText = (EditText) findViewById(R.id.numGuessEditText);

        int guessNum = Integer.parseInt(numGuessEditText.getText().toString());

        if (guessNum < ranPick) {
            makeToast("Nope try again Higher");

        } else if (guessNum > ranPick) {
            makeToast("Nope try again Lower");

        } else {
            makeToast("Bingo, you got it");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Random Number Generator method
    public int ran() {
        Random r = new Random();
        int randomNumber = r.nextInt(30) + 1;
        return randomNumber;
    }
}