/**
*@author Vanessa Manganyi
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchItLinear{
   public static void main(String [] args){
      /**
       * Uses try-catch to handle FileNotFoundExceptions. 
       *First tries to process the data but returns file not found if it can't find the file
      */
      try{
         File f = new File("/home/m/mngvan003/CSC2001F/Assignment1/src/testdata");
         Scanner s = new Scanner(f);
         String [] sa = new String[10000]; //creates array to store information
         
      /**
       * uses for-loop to enter each entry of the form {full name, data} into array
       */
         for (int i = 0; i<10000; i++){
            String line = s.nextLine();
            String[] info = line.split("\\|");
            String proper = info[2]+","+info[1]+info[0];
            sa[i] = proper;
         }
         
         File fF = new File("/home/m/mngvan003/CSC2001F/Assignment1/src/query");
         Scanner inputF = new Scanner(fF);
         
	int check;
        check = 0;
         /**
          * loops through query textfile and compares each line to the items in the array
          */
         while(inputF.hasNextLine()){
            String l = inputF.nextLine();
             for(String inarray: sa){
               String [] in;
               in = inarray.split("\\,");
               String fname = in[0];
	       if(l.equals(fname)){
	       	  System.out.println(inarray);
	       }
	     } 
         }
      }
      catch(FileNotFoundException e){
         System.out.println("File not found.");
      }
   }
}
