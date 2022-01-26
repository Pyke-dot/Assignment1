package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import org.mariuszgromada.math.mxparser.*;
import java.math.*;

public class MainActivity extends AppCompatActivity {

    public static TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);

    }
    private void push(String strToAdd){
        ArrayList<String> oldStr = new ArrayList<String>();
        oldStr.add(strToAdd);
        for (String element : oldStr) {
            display.setText();
        }

    }

    public void zero_btn(View view){
        push("0");
    }
    public void one_btn(View view){
        push("1");
    }
    public void two_btn(View view){
        push("2");
    }
    public void three_btn(View view){
        push("3");
    }
    public void four_btn(View view){
        push("4");
    }
    public void five_btn(View view){
        push("5");
    }
    public void six_btn(View view){
        push("6");
    }
    public void seven_btn(View view){
        push("7");
    }
    public void eight_btn(View view){
        push("8");
    }
    public void nine_btn(View view){
        push("9");
    }
    public void reset_btn(View view){
        display.setText("");
    }
    public void add_btn(View view){
        push("+");
    }
    public void subtract_btn(View view){
        push("-");
    }
    public void multiply_btn(View view){
        push(getText(R.string.multiply).toString());
    }
    public void divide_btn(View view){
        push("/");
    }

    public void equal_btn(View view){
        String userExpression = display.getText().toString();

        String result = String.valueOf(Calculator.calculate());
        if(result.equals("-9999")){
            push("=NOT AN OPERATOR");
        }else {
            push("=" + result);
        }
    }
    public void remainder_btn(View view){
        push("%");
    }
    public void power_btn(View view){
        push("pow");
    }
    public void max_btn(View view){
        push("Max");
    }
    public void min_btn(View view){
        push("Min");
    }

    public void advance_btn(View view){
        TextView advance = findViewById(R.id.advance);
        if(getText(R.string.advanceText).toString().equals(advance.getText().toString())) {
            advance.setText(R.string.standardText);
            findViewById(R.id.scientific).setVisibility(View.VISIBLE);
        }else{
            advance.setText(R.string.advanceText);
            findViewById(R.id.scientific).setVisibility(View.GONE);
        }
    }
}