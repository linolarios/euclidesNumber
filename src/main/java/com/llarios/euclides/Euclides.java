package com.llarios.euclides;

public class Euclides {



    public static int findMCD(int a, int b){

        if(b == 0){
            return a;
        }

        return findMCD(b,(a % b));
    }
}
