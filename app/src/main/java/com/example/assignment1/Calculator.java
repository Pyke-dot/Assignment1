package com.example.assignment1;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;

public class Calculator{
    public static ArrayList<String> cal = new ArrayList<>();
    public static int calculate(){
        int res = 0;
        int counter = 0;
        cal.clear();
        cal.addAll(MainActivity.userInput);
        System.out.println(cal);

        if(cal.size() % 2 != 1){
            res = -999;
        }else {
            for(int i = 0; i < cal.size() ; i++) {
            if(counter == 0) {
                    if(cal.get(0).matches("[0-9]") && !cal.get(1).matches("[0-9]") && cal.get(2).matches("[0-9]") ){
                        System.out.println("isDigit");
                        switch (cal.get(1)) {
                            case "+":
                                res = (parseInt(cal.get(0)) + parseInt(cal.get(2)));
                                System.out.println("res:" + res);
                                break;
                            case "-":
                                res = (parseInt(cal.get(0)) - parseInt(cal.get(2)));
                                System.out.println("res:" + res);
                                break;
                            case "*":
                                res = (parseInt(cal.get(0)) * parseInt(cal.get(2)));
                                System.out.println("res:" + res);
                                break;
                            case "/":
                                res = (parseInt(cal.get(0)) / parseInt(cal.get(2)));
                                System.out.println("res:" + res);
                                break;
                            case "pow":
                                res = (int) Math.pow(parseInt(cal.get(0)), parseInt(cal.get(2)));
                                System.out.println("res:" + res);
                                break;
                            case "%":
                                res = (parseInt(cal.get(0)) % parseInt(cal.get(2)));
                                System.out.println("res:" + res);
                                break;
                            case "Max":
                                res = (int) Math.max(parseInt(cal.get(0)), parseInt(cal.get(2)));
                                System.out.println("res:" + res);
                                break;
                            case "Min":
                                res = (int) Math.min(parseInt(cal.get(0)), parseInt(cal.get(2)));
                                System.out.println("res:" + res);
                                break;
                        }
                        counter = 1;
                        cal.remove(0);
                        cal.remove(0);
                        cal.remove(0);
                        System.out.println(cal);
                    }else{
                        res = -999;
                    }
            }else {
                if(!cal.get(0).matches("[0-9]") && cal.get(1).matches("[0-9]")) {
                    switch (cal.get(0)) {
                        case "+":
                            res = (res + parseInt(cal.get(1)));
                            System.out.println("res:" + res);
                            break;
                        case "-":
                            res = (res - parseInt(cal.get(1)));
                            System.out.println("res:" + res);
                            break;
                        case "*":
                            res = (res * parseInt(cal.get(1)));
                            System.out.println("res:" + res);
                            break;
                        case "/":
                            res = (res / parseInt(cal.get(1)));
                            System.out.println("res:" + res);
                            break;
                        case "pow":
                            res = (int) Math.pow(res, parseInt(cal.get(1)));
                            System.out.println("res:" + res);
                            break;
                        case "%":
                            res = (res % parseInt(cal.get(1)));
                            System.out.println("res:" + res);
                            break;
                        case "Max":
                            res = (int) Math.max(res, parseInt(cal.get(1)));
                            System.out.println("res:" + res);
                            break;
                        case "Min":
                            res = (int) Math.min(res, parseInt(cal.get(1)));
                            System.out.println("res:" + res);
                            break;
                    }
                    cal.remove(0);
                    cal.remove(0);
                }else{
                    res = -999;
                }
            }
                System.out.println(i);
            }
        }

        System.out.println("Result:" + res);
        return res;
    }
}
