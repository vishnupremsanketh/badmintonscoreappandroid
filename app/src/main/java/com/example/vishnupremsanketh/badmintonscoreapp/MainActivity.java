package com.example.vishnupremsanketh.badmintonscoreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button _btnsingles,_btndoubles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _btnsingles=(Button) findViewById(R.id.btnsingles);
        _btnsingles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsingles= new Intent(MainActivity.this,Singles.class);
                startActivity(intentsingles);
            }
        });

    }
}
