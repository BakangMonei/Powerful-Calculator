package com.myCal.scical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

// For progress dialog
import android.app.ProgressDialog;
import android.os.CountDownTimer;


public class MainActivity extends AppCompatActivity {

    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView logo = (TextView) findViewById(R.id.logo);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onStart();
                Toast.makeText(MainActivity.this, "Choose the type of calculator of your choice.", Toast.LENGTH_LONG).show();
                Intent intentLayer = new Intent(MainActivity.this, optionChoices.class);
                startActivity(intentLayer);
            }
        });
    }
    // For progress dialog
    public void onStart(){
        super.onStart();
        progressDialog = ProgressDialog.show(this, "Please Wait", "Processing....", true);
        CountDownTimer timer = new CountDownTimer(3000, 1000){
            @Override
            public void onTick(long millisUntilFinished){}
            @Override
            public void onFinish(){
                progressDialog.dismiss();
            }
        }.start();// CountDownTimer
    }//

}

/*Toast.makeText(this, "Press the text to proceed.", Toast.LENGTH_LONG).show();
        Intent intentLayer = new Intent(this, MainActivityAnother.class);
        startActivity(intentLayer);*/