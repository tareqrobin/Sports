package com.tareqrobin.sports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnC,btnF,btnV,btnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnC=findViewById(R.id.button);
        btnF=findViewById(R.id.button2);
        btnV=findViewById(R.id.button3);
        btnB=findViewById(R.id.button4);

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(MainActivity.this,CricketActivity.class);
                startActivity(a);
            }
        });

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(MainActivity.this,FootballActivity.class);
                startActivity(a);
            }
        });
        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(MainActivity.this,VollyballActivity.class);
                startActivity(a);
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x=new Intent(MainActivity.this,BadmintonActivity.class);
                startActivity(x);
            }
        });


    }
}
