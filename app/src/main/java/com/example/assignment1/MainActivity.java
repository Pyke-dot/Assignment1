package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public TextView display;

    Button one_btn, two_btn,three_btn, four_btn, five_btn, six_btn, seven_btn, eight_btn, nine_btn, zero_btn,
            add_btn, subtract_btn, multiply_btn, divide_btn, reset_btn, equal_btn, advance_btn, pow_btn, remainder_btn,
            max_btn,min_btn;

    public static ArrayList<String> userInput = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);

        zero_btn = findViewById(R.id.zero);      //0
        zero_btn.setOnClickListener(this);
        one_btn = findViewById(R.id.one);        //1
        one_btn.setOnClickListener(this);
        two_btn = findViewById(R.id.two);        //2
        two_btn.setOnClickListener(this);
        three_btn = findViewById(R.id.three);    //3
        three_btn.setOnClickListener(this);
        four_btn = findViewById(R.id.four);      //4
        four_btn.setOnClickListener(this);
        five_btn = findViewById(R.id.five);      //5
        five_btn.setOnClickListener(this);
        six_btn = findViewById(R.id.six);        //6
        six_btn.setOnClickListener(this);
        seven_btn = findViewById(R.id.seven);        //7
        seven_btn.setOnClickListener(this);
        eight_btn = findViewById(R.id.eight);        //8
        eight_btn.setOnClickListener(this);
        nine_btn = findViewById(R.id.nine);        //9
        nine_btn.setOnClickListener(this);
        add_btn = findViewById(R.id.add);        //add
        add_btn.setOnClickListener(this);
        subtract_btn = findViewById(R.id.subtract);        //subtract
        subtract_btn.setOnClickListener(this);
        multiply_btn = findViewById(R.id.multiply);        //multiply
        multiply_btn.setOnClickListener(this);
        divide_btn = findViewById(R.id.divide);        //divide
        divide_btn.setOnClickListener(this);
        advance_btn = findViewById(R.id.advance);        //advance
        advance_btn.setOnClickListener(this);
        equal_btn = findViewById(R.id.equal);        //equal
        equal_btn.setOnClickListener(this);
        reset_btn = findViewById(R.id.clear_text);        //reset
        reset_btn.setOnClickListener(this);
        pow_btn = findViewById(R.id.power);        //pow
        pow_btn.setOnClickListener(this);
        remainder_btn = findViewById(R.id.remainder);        //remainder
        remainder_btn.setOnClickListener(this);
        max_btn = findViewById(R.id.max);        //max
        max_btn.setOnClickListener(this);
        min_btn = findViewById(R.id.min);        //min
        min_btn.setOnClickListener(this);
    }

    public void push(String strToAdd){
        userInput.add(strToAdd);
        String oldStr = display.getText().toString();
        display.setText(String.format("%s %s",oldStr,strToAdd));
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id) {
            case R.id.one :
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.one).toString());
                }else {
                    push(getText(R.string.one).toString());
                }
                break;
            case R.id.two:
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.two).toString());
                }else {
                    push(getText(R.string.two).toString());
                }
                break;
            case R.id.three :
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.three).toString());
                }else {
                    push(getText(R.string.three).toString());
                }
                break;
            case R.id.four:
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.four).toString());
                }else {
                    push(getText(R.string.four).toString());
                }
                break;
            case R.id.five :
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.five).toString());
                }else {
                    push(getText(R.string.five).toString());
                }
                break;
            case R.id.six:
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.six).toString());
                }else {
                    push(getText(R.string.six).toString());
                }
                break;
            case R.id.seven :
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.seven).toString());
                }else {
                    push(getText(R.string.seven).toString());
                }
                break;
            case R.id.eight:
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.eight).toString());
                }else {
                    push(getText(R.string.eight).toString());
                }
                break;
            case R.id.nine :
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.nine).toString());
                }else {
                    push(getText(R.string.nine).toString());
                }
                break;
            case R.id.zero:
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.zero).toString());
                }else {
                    push(getText(R.string.zero).toString());
                }
                break;
            case R.id.add :
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.add).toString());
                }else {
                    push(getText(R.string.add).toString());
                }
                break;
            case R.id.multiply:
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.multiply).toString());
                }else {
                    push(getText(R.string.multiply).toString());
                }
                break;
            case R.id.subtract :
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.subtract).toString());
                }else {
                    push(getText(R.string.subtract).toString());
                }
                break;
            case R.id.divide:
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.divide).toString());
                }else {
                    push(getText(R.string.divide).toString());
                }
                break;
            case R.id.clear_text:
                display.setText("");
                userInput.clear();
                break;
            case R.id.equal:
                String userExpression = display.getText().toString();
                if(userExpression.isEmpty()){
                    display.setText("");
                    userInput.clear();
                }else if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                }
                else{
                    String result = String.valueOf(Calculator.calculate());
                    if (result.equals("-999")) {
                        push("= NOT AN OPERATOR");
                    } else {
                        push("= " + result);
                    }
                    userInput.clear();
                }
                break;
            case R.id.advance :
                TextView advance = findViewById(R.id.advance);
                if(getText(R.string.advanceText).toString().equals(advance.getText().toString())) {
                    advance.setText(R.string.standardText);
                    findViewById(R.id.scientific).setVisibility(View.VISIBLE);
                }else{
                    advance.setText(R.string.advanceText);
                    findViewById(R.id.scientific).setVisibility(View.GONE);
                }
                break;
            case R.id.power:
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.power).toString());
                }else {
                    push(getText(R.string.power).toString());
                }
                break;
            case R.id.remainder :
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.remainder).toString());
                }else {
                    push(getText(R.string.remainder).toString());
                }
                break;
            case R.id.max:
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.max).toString());
                }else {
                    push(getText(R.string.max).toString());
                }
                break;
            case R.id.min :
                if(display.getText().toString().contains("=")){
                    display.setText("");
                    userInput.clear();
                    push(getText(R.string.min).toString());
                }else {
                    push(getText(R.string.min).toString());
                }
                break;

        }
    }
}