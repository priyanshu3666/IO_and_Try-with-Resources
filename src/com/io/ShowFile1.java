package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile1 {
    public static void main(String[] args) {
        int i;
        FileInputStream fileInputStream = null;

        // first , confirm that a filename has been specified.
        if (args.length != 1) {
            System.out.println("Usage : ShowFile filename");
            return;
        }
        //attempt to open a file
        try {
            fileInputStream = new FileInputStream(args[0]);
            do {
                i = fileInputStream.read();
                if (i!= -1)
                {
                    System.out.println((char) i);
                }
            }while (i!= -1);
        }
        catch (FileNotFoundException exception)
        {
            System.out.println(" File not found ");
        }
        catch (IOException exception)
        {
            System.out.println("An I/O Error Occurred");
        }
        finally {
            try {
                if (fileInputStream!= null)
                {
                    fileInputStream.close();
                }
            }
            catch (IOException exception)
            {
                System.out.println("Error Closing File");
            }
        }
    }
}
