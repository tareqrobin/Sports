package com.tareqrobin.sports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FootballActivity extends AppCompatActivity {
    private Button btnH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);
        btnH=findViewById(R.id.button8);
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h=new Intent(FootballActivity.this,MainActivity.class);
                startActivity(h);
            }
        });
    }
}
