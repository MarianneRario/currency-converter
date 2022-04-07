package com.semaphore.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /* void method that will convert the entered currency */
    public void convertCurrency(View view){
        Log.i("Info", "Button xpressed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* id of the convert button should be called inside the onCreate method only */
        Button convertBtn = (Button) findViewById(R.id.covertBtnId);

        /* onClick method for the convert button */
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // call the convertCurrency method inside the onClick method
                convertCurrency(convertBtn);
            }
        }); // setOnClickListener only works inside onCreate method

    }


}
