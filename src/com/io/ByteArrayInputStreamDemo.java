package com.io;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

    // Java program illustrating the working of ByteArrayInputStream method
    // mark(), read(), skip(), available()
    // markSupported(), close(), reset()

    public static void main(String[] args) throws Exception
    {
        byte[] buffer = {72, 67, 65, 91, 83};
        ByteArrayInputStream geek = null;
        try
        {
            geek = new ByteArrayInputStream(buffer);

            // Use of available() method : telling the no. of bytes to be read
            int number = geek.available();
            System.out.println("Use of available() method : " + number);


            // Use of read() method : reading and printing Characters one by one
            System.out.println("\nChar : "+(char)geek.read());
            System.out.println("Char : "+(char)geek.read());
            System.out.println("Char : "+(char)geek.read());

            // Use of mark() :
            geek.mark(0);

            // Use of skip() : it results in skipping 'k' from "GEEKS"
            geek.skip(1);
            System.out.println("skip() method comes to play");
            System.out.println("mark() method comes to play");
            System.out.println("Char : "+(char)geek.read());

            // Use of markSupported
            boolean check = geek.markSupported();
            System.out.println("\nmarkSupported() : " + check);
            if(geek.markSupported())
            {
                // Use of reset() method : repositioning the stream to marked positions.
                geek.reset();
                System.out.println("\nreset() invoked");
                System.out.println("Char : "+(char)geek.read());
                System.out.println("Char : "+(char)geek.read());
            }
            else
            {
                System.out.println("reset() method not supported.");
            }

            System.out.println("geek.markSupported() supported reset() : "+check);

        }
        catch(Exception except)
        {
            // in case of I/O error
            except.printStackTrace();
        }
        finally
        {
            // releasing the resources back to the GarbageCollector when closes
            if(geek!=null)
            {
                // Use of close() : closing the file and releasing resources
                geek.close();
            }
        }
    }
}
