    package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

    public class CalculatorExercise extends AppCompatActivity {

        private EditText expression;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_exercise);

        expression = findViewById(R.id.input);
        expression.setShowSoftInputOnFocus(false);
        expression.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getString(R.string.placeholder).equals(expression.getText().toString())){
                    expression.setText("0");
                }
            }
        });
    }

    private void update(String str){
        String old = expression.getText().toString();
        int cursorPos = expression.getSelectionStart();
        String left = old.substring(1,cursorPos);
        String right = old.substring(cursorPos);
        expression.setText(String.format("%s %s %s", left,str,right));
    }

    public void btn0(View view){
        update("0");
    }

        public void btn1(View view){
            update("1");
        }


}