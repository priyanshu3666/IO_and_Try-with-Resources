package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// use a BufferReader to read characters from console
public class BufferReaderRead {
    public static void main(String[] args) throws IOException {
        char character;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters , 'q' to quit ");
        //read characters
        do {
            character = (char) bufferedReader.read();
            System.out.println(character);
        }while (character != 'q');
    }

}
