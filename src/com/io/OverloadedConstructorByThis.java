package com.io;

public class OverloadedConstructorByThis {

    int a;
    int b;

    // initialize a and b individually
    OverloadedConstructorByThis(int i, int j){
        a = i;
        b = j;
    }

    //initialize a and b to the same value
    OverloadedConstructorByThis(int i){
        this(i, i);
    }

    // give a and b default values of 0
    OverloadedConstructorByThis(){
        this(0);
    }

    public static void main(String[] args) {
        OverloadedConstructorByThis obj = new OverloadedConstructorByThis(8);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}


