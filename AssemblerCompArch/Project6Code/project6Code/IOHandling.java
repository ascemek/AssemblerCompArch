package project6Code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Sami Cemek
 * @date Nov 09 2022
 * @version 1.1
 */

public interface IOHandling {

	public static String readData(String readFileName) {
		
		StringBuilder s = new StringBuilder();
		
		try {
		      File myObj = new File(readFileName);
		      Scanner myReader = new Scanner(myObj);
		      
		      while (myReader.hasNextLine()) {
		        s.append(myReader.nextLine()+'\n');
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		    	System.out.println("An error occurred.");
		    	e.printStackTrace();
		    }
		  
		return s.toString();
	}
	
	public static void writeData(String data, String writeFileName) {
	
		 try {
		      FileWriter myWriter = new FileWriter(writeFileName);
		      
		      myWriter.write(data);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    
		 } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		  }
		
	}
	
	public static void printData(String data) {
		
		System.out.println(data);
		
	}
}
