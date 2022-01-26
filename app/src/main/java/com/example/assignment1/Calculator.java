package com.example.assignment1;


import org.mariuszgromada.math.mxparser.Expression;


public class Calculator{

    public static int calculate(){
        int res;
        String userExpression = MainActivity.display.getText().toString();
        if(userExpression.length() == 2){
            res = -9999;
        }else {
            Expression exp = new Expression(userExpression);
            res = (int) exp.calculate();
        }
        return res;
    }
}
