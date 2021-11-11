package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Read a string from console using BufferedReader.
public class BufferReaderReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines to text .");
        System.out.println("Enter jarvis-stop-it to quit .");

        do {
            str = bufferedReader.readLine();
            System.out.println(str);
        } while (!str.equals("jarvis-stop-it"));
    }
}
