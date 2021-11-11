package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  Display a text file
 *  To use this program , specify the name
 *  of the file that you want to see .
 *  For example , to see a file called TEST.TXT ,
 *  use the following command line.
 *
 *  java ShowFile TEST.TXT
 */

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fileInputStream;

        // first , confirm that a filename has been specified.
        if (args.length != 1)
        {
            System.out.println("Usage : ShowFile filename");
            return;
        }
        //attempt to open a file

        try {
            fileInputStream = new FileInputStream(args[0]);
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("Cannot Open File");
            return;
        }

        // At this point , the file is open and can be read .
        //the following reads the characters until EOF is encountered .
        try {
            do {
                i = fileInputStream.read();
                if (i!= -1)
                {
                    System.out.println((char) i);
                }
            }while (i!= -1);
        }
        catch (IOException exception)
        {
            System.out.println("Error Reading File ");
        }

        // close the  file .
        try {
            fileInputStream.close();
        }
        catch (IOException exception)
        {
            System.out.println("Error Closing File");
        }
    }
}
