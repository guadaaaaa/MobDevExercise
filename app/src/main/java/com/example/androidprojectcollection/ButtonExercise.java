package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class ButtonExercise extends AppCompatActivity {
    Button btnClose, btnToast, btnChangeBG, btnChangeBut, btnDisappear;
    Random color;
//    ConstraintLayout Background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        btnClose = (Button)findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentClose = new Intent(ButtonExercise.this, ButtonExercise_EmptyActivity.class);
                startActivity(intentClose);
            }
        });

        btnToast = (Button) findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonExercise.this, "Toast ni!", Toast.LENGTH_SHORT).show();
            }
        });


        btnChangeBG = (Button) findViewById(R.id.btnChangeBG);
        final View Background = (ConstraintLayout) findViewById(R.id.Background);
        final Paint p = new Paint();

        btnChangeBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color = new Random();
                p.setARGB(255,color.nextInt(255),color.nextInt(255),color.nextInt(255));
                Background.setBackgroundColor((p.getColor()));
            }
        });

        btnChangeBut = (Button) findViewById(R.id.btnChangeBut);
        btnChangeBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color = new Random();
                p.setARGB(255,color.nextInt(255),color.nextInt(255),color.nextInt(255));
                btnChangeBut.setBackgroundColor((p.getColor()));
            }
        });

        btnDisappear = (Button) findViewById(R.id.btnDisappear);
        btnDisappear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDisappear.setVisibility(View.GONE);
            }
        });
    }
}