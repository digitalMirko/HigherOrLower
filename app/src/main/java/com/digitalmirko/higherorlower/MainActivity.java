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

    public void btnClicked(View view){
       // Test to see if Random Number Generator is working
       Log.i("Random Number", Integer.toString(ranPick));

       EditText numGuessEditText = (EditText) findViewById(R.id.numGuessEditText);

       if(Integer.parseInt(numGuessEditText.getText().toString()) < ranPick){
                Toast.makeText(this, "Nope try again Higher", Toast.LENGTH_SHORT).show();
            } else if (Integer.parseInt(numGuessEditText.getText().toString()) > ranPick){
                Toast.makeText(this, "Nope try again Lower", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Bingo, you got it", Toast.LENGTH_SHORT).show();
       }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Random Number Generator method
    public int ran (){
        Random r = new Random();
        int randomNumber = r.nextInt(30 - 1 + 1) + 1;
        return randomNumber;
    }
}
