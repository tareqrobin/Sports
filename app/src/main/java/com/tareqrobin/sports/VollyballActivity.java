package com.tareqrobin.sports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VollyballActivity extends AppCompatActivity {
    private Button btnH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vollyball);
        btnH = findViewById(R.id.button7);
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z=new Intent(VollyballActivity.this,MainActivity.class);
                startActivity(z);
            }
        });
    }
}
