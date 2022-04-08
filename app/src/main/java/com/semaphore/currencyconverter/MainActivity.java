package com.semaphore.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* void method that will convert the entered currency */
    public void convertCurrency(View view){
        EditText amount = (EditText) findViewById(R.id.editTextNumberDecimal); // id of the editTextNumberDecimal
        String amountInPeso = amount.getText().toString(); // gets the entered amount in EditTextView
        double amountInDollarDouble = Double.parseDouble(amountInPeso) * 0.019; // convert php to usd
        String amountInDollarString = String.format("%.2f", amountInDollarDouble);
        Log.i("Amount in Dollars", amountInDollarString); // log the info every button press to make sure that the button is working correctly
        showAmount(view, amountInDollarString);
    }


    public void showAmount(View view, String amountInDollars){
        /* convertedAmountTextView Id */
        TextView convertedAmountTextView = (TextView) findViewById(R.id.convertedAmountId);
        convertedAmountTextView.setText(convertedAmountTextView.getText() + amountInDollars); // append to the current text in the .xml; only accepts String value
        convertedAmountTextView.setVisibility(View.VISIBLE); // changed the visibility to visible

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* button IDs should initialized inside onCreate method to function */
        Button convertBtn = (Button) findViewById(R.id.covertBtnId);

        /* onClick method for the convert button */
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // call the convertCurrency method inside the onClick method
                convertCurrency(view);
            }
        }); // setOnClickListener only works inside onCreate method

    }


}
