package com.example.ranodysmilly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtshowJok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_library);
        txtshowJok = (TextView)findViewById(R.id.txtshowJok);
        Intent intent = getIntent();

        if(intent.hasExtra("JOKE")){
            txtshowJok.setText(intent.getStringExtra("JOKE"));

        }


    }
}
