package com.example.paymentpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goPaymentPage(View view) {
        Intent intenta = new Intent(MainActivity.this, PaymentPages.class);
        startActivity(intenta);

    }
}