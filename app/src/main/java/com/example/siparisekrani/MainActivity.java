package com.example.siparisekrani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ileribtn;
    Button geribtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ileribtn = findViewById(R.id.button);
        ileribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hocam benden bu kadar.", Toast.LENGTH_SHORT).show();
            }
        });
        geribtn = findViewById(R.id.button2);
        geribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hocam benden bu kadar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}