package com.example.munawar.pay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CreditCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card);
    }


    public void pay(View v){
        Toast.makeText(this, "Your payment has been done", Toast.LENGTH_SHORT).show();
    }
}
