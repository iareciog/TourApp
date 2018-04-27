package com.example.android.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent i = getIntent();

        int zoneName = i.getIntExtra("zoneName", 0);
        int zoneText = i.getIntExtra("zoneText",0);

        TextView textZoneName = findViewById(R.id.info_title);
        TextView textZone = findViewById(R.id.info_text);

        if(zoneName == 0){
            textZoneName.setText(R.string.hello_blank_fragment);
        }else{
            textZoneName.setText(zoneName);
            textZone.setText(zoneText);
            setTitle(zoneName);
        }
    }
}
