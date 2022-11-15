package project6Code;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Sami Cemek
 * @date Nov 09 2022
 * @version 1.1
 */

class MyFileReader{
	
    public List<String> readFile(String fileName) throws Exception{
        
        String line = null;  
        List<String> data = new ArrayList<String>();
        
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(fileName));
        
            while((line = bfReader.readLine())!= null)
                {
                 data.add(line);
                }
            bfReader.close();
            }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        return data;
    }
}

public class Assembler{

    // remove all comments and blank lines from an .asm file and writes the result to a new file.
    public static void removeComments(String filename){
       
        String[] arrOfStr = filename.split("//");
  
        for (String a : arrOfStr)
            System.out.println(a);
        // work in progress
    }
    


}

