package project6Code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sami Cemek
 * @date Nov 09 2022
 * @version 1.1
 */

/*
 * main program that drives the entire translation process.
 */

public class TestClass {
    public static void main(String[] args) {

        //MyFileReader myFileReader = new MyFileReader();
		//List<String> data = myFileReader.readFile("Sum1ToN.asm");

        // Read the asm file
        try {
            File myObj = new File("Sum1ToN.asm");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Write a new asm file
        try {
            FileWriter myWriter = new FileWriter("NoCommentAssembly.asm");

            // Remove the comments
            Assembler.removeComments("Sum1ToN.asm");

            //myWriter.write("Files in Java might be tricky, but it is fun enough!");

            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        /* 
        String csv = result.getText();

        try {
            Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("NoCommentAssembly.asm")));
            writer.write(csv);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       */


    }
}
