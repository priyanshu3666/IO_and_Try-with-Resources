package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// tiny editor
public class TinyEditor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader  =  new BufferedReader(new InputStreamReader(System.in)) ;
        String[] str = new String[100];
        System.out.println("Enter lines of text. ");
        System.out.println("Enter 'stop' to quit .");
        for (int i = 0; i<100;i++){
            str[i] = bufferedReader.readLine();
            if(str[i].equals("stop"))
            {
                break;
            }
        }
        System.out.println("\nHere is your file : \n");

        // display the lines
        for (int line = 0; line< 100;line++){
            if (str[line].equals("stop"))
            {
                break;
            }
            System.out.println(str[line]);
        }
    }
}
