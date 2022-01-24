package com.psp.instrumentedtest_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtHello,txtWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        Button btnWorld = findViewById(R.id.btnWorld);
        txtHello = findViewById(R.id.txtHello);
        txtWorld = findViewById(R.id.txtWorld);

        btnHello.setOnClickListener(this);
        btnWorld.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnHello: {
                txtHello.setText("hello");
                break;
            }

            case R.id.btnWorld: {
                txtWorld.setText("world");
                break;
            }
        }
    }
}