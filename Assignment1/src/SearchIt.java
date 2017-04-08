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
      File f = new File("/home/m/mngvan003/CSC2001F/Assignment1/src/testdata");
      Scanner s = new Scanner(f);
      BinaryTree bst = new BinaryTree();
      
      /**
       * loops through the original textfile and enters each line into binary tree.
       * Changes the form of each entry to {full name; data}
       */
      while(s.hasNextLine()){
            String line = s.nextLine();
            String[] info = line.split("\\|");
            String proper = info[2]+","+info[1]+info[0];
            bst.insert(proper);
         }
      
      /**
       * Uses while loop to compare each line in the query file and searches for the 
       * String item in the binary search tree using the find(item) method.
       */      
      File fF = new File("/home/m/mngvan003/CSC2001F/Assignment1/src/query");
      Scanner inputF = new Scanner(fF);
      
      while(inputF.hasNextLine()){
            String key = inputF.nextLine();
            System.out.println(bst.find(key));
         }
      }
   catch(FileNotFoundException e){
      System.out.println("File not found");
      }
   }
}
