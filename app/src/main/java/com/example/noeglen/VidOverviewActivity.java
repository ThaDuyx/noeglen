package com.example.noeglen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VidOverviewActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidoverview);

        btn = findViewById(R.id.button3);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, VidPageActivity.class);
        startActivity(intent);
    }
}
