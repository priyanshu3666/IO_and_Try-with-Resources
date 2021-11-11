package com.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    public static void main(String[] args)
    {
        FileWriter fileWriter; //initializing FileWriter
        try
        {
            fileWriter = new FileWriter("ABC.txt");
            // Initialing BufferedWriter
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            System.out.println("Buffered Writer start writing :)");
            // Use of write() method to write the value in 'ABC' file

            bufferedWriter.write(69); // Printing E
            bufferedWriter.newLine(); // For next line
            bufferedWriter.write(49); // Printing 1

            // flush() method : flushing the stream
            bufferedWriter.flush();
            // close() method : closing BufferWriter to end operation
            bufferedWriter.close();
            System.out.println("Written successfully");
        }
        catch (IOException except)
        {
            except.printStackTrace();
        }

    }
}
