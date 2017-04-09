/**
 *@author Vanessa Manganyi
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SearchIt{
   public static void main(String [] args){
    /**
     * Uses try-catch to handle FileNotFoundExceptions.
     * First tries to process the data but returns file not found if it can't find the file
     */
   try{
      File f = new File("/home/m/mngvan003/EDT/src/testdata");
      Scanner s = new Scanner(f);
      BinaryTree bst = new BinaryTree();
      
      /**
       * loops through the original textfile and enters each line into binary tree.
       * Changes the form of each entry to {full name; data}
       */
      while(s.hasNextLine()){
            String line = s.nextLine();
            String[] info = line.split("\\|");
            String proper = info[2]+","+info[1]+info[0];//System.out.print(l);
            bst.insert(proper);
         }
      
      /**
       * Uses while loop to compare each line in the query file and searches for the 
       * String item in the binary search tree using the find(item) method.
       */  
      boolean check;
      check = false;     
      File fF = new File("/home/m/mngvan003/EDT/src/query");
      Scanner inputF = new Scanner(fF);
      
while(inputF.hasNextLine()){
            String l = inputF.nextLine();
            check = false;
            for(String inarray: sa){
               String [] in;
               in = inarray.split("\\,");
               String fname = in[0];
	       if(l.equals(fname)){
	       	  System.out.println(inarray);
                  check = true;
               }
            }
         if(!check){
                System.out.println("Not found");
         }
         }
      
      }
   catch(FileNotFoundException e){
      System.out.println("File not found");
      }
   }
}

