package com.example.noeglen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h = findViewById(R.id.button7);
        h.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == h){
            Intent intent = new Intent(this, VidOverviewActivity.class);
            startActivity(intent);
        }
    }
}
