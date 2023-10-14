package org.example;

public class Calculator {

    public int sum (int a, int b){
        return a + b;
    }

    public int area(int base, int height){
        return base * height;
    }

    public int perimeter(int base, int height){
        return  base * 2 + height * 2;
    }

    public boolean isTriangle (int a, int b, int c){
        if (sum(a, b) < c){
            return  true;
        }
        if (sum(a,c) < b){
            return true;
        }
        if (sum(b,c) < a){
            return true;
        }
        return false;
    }
}
