package com.io;


//Demonstrate assert
public class AssertDemo {
    static int val = 3;

    static int getNum(){
        return val--;
    }

    public static void main(String[] args) {
        int num;

        for(int i=0; i<10; i++){
            num = getNum();

//            assert num>0;   //will fail when num is 0

            assert num>0 : "num is not positive";  //assert with message

            System.out.println("number is: "+num);
        }
    }
}