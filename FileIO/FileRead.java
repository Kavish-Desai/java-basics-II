package FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class FileRead{
    public static void main(String[] args){
      
       int wordCount = 0;

       try{
       FileReader file = new FileReader("FileIO/input.txt");
       Scanner input = new Scanner(file);
       FileWriter output = new FileWriter("FileIO/output.txt");

        while(input.hasNext()){
            input.next();
            wordCount++;
        }
        output.write("The number of words in input.txt are: " + String.valueOf(wordCount));
        output.close();
        input.close();
        
       }catch(IOException i){
        System.out.println("Error occured");
       }
    }

    
}