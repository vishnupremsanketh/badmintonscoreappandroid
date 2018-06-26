package com.example.vishnupremsanketh.badmintonscoreapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Singles extends AppCompatActivity {
    TextView _box1,_box2,_box3,_box4,_player1score,_player2score;
    Button _btn1,_btn2;
    int clickcount1=0;
    int clickcount2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singles);
        _btn1=(Button) findViewById(R.id.btn1);
        _btn2=(Button) findViewById(R.id.btn2);
        _box1=(TextView) findViewById(R.id.text1);
        _box2=(TextView) findViewById(R.id.text2);
        _box3=(TextView) findViewById(R.id.text3);
        _box4=(TextView) findViewById(R.id.text4);
        _player1score=(TextView) findViewById(R.id.textplay1score);
        _player2score=(TextView) findViewById(R.id.textplay2score);
        _btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickcount1=clickcount1+1;
                _player1score.setText(String.valueOf(clickcount1));
                if(clickcount1%2==0){
                    _box2.setBackgroundColor(Color.rgb(255,255,255));
                    _box3.setBackgroundColor(Color.rgb(255,255,255));
                    _box4.setBackgroundColor(Color.rgb(255,255,255));
                    _box1.setBackgroundColor(Color.BLUE);
                }
                else{
                    _box1.setBackgroundColor(Color.rgb(255,255,255));
                    _box2.setBackgroundColor(Color.rgb(255,255,255));
                    _box4.setBackgroundColor(Color.rgb(255,255,255));
                    _box3.setBackgroundColor(Color.BLUE);
                }

            }
        });
        _btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickcount2=clickcount2+1;
                _player2score.setText(String.valueOf(clickcount2));
                if(clickcount2%2!=0){
                    _box1.setBackgroundColor(Color.rgb(255,255,255));
                    _box3.setBackgroundColor(Color.rgb(255,255,255));
                    _box4.setBackgroundColor(Color.rgb(255,255,255));
                    _box2.setBackgroundColor(Color.BLUE);
                }
                else{
                    _box1.setBackgroundColor(Color.rgb(255,255,255));
                    _box2.setBackgroundColor(Color.rgb(255,255,255));
                    _box3.setBackgroundColor(Color.rgb(255,255,255));
                    _box4.setBackgroundColor(Color.BLUE);
                }

            }
        });
    }
}
