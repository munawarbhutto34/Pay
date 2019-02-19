package com.example.munawar.pay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public RatingBar ratingBar;
    private Button cashbutton;
    private Button creditbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        creditbutton = (Button) findViewById(R.id.credit);
        creditbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                creditactivity();
            }
        });

        cashbutton = (Button) findViewById(R.id.cash);
        cashbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cashactivity();
            }
        });
    }

    public void creditactivity(){
        Intent i = new Intent(this, CreditCard.class);
        startActivity(i);
    }

    public void cashactivity(){
        Intent i = new Intent(this, Cash.class);
        startActivity(i);
    }

    public void rateMe(View view){

        Toast.makeText(getApplicationContext(),
                String.valueOf(ratingBar.getRating()), Toast.LENGTH_SHORT).show();
    }

}
