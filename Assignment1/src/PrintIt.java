/**
*@author Vanessa Manganyi
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
*Program prints out contents of textfile in order.
* Uses a binary tree.
*/

public class PrintIt{
   
   public static void main(String [] args){
      /**
       * Uses try-catch to handle FileNotFoundExceptions.
       * First tries to process the data but returns file not found if it can't find the file
     */
      try{
         File f = new File("testdata.txt");
         Scanner s = new Scanner(f);
         BinaryTree bst = new BinaryTree(); //create tree
         
         /**
          *Loops through textfile and enters each line into the binary tree
          *Changes the format of the line so that it is [full name, data]
          *Inserts line into tree
          *Prints items from binary tree
         */
         while(s.hasNextLine()){
            String line = s.nextLine();
            String l = s.nextLine();
            String[] info = l.split("\\|");
            String proper = info[2]+","+info[1]+info[0]; 
            bst.insert(proper); 
         }
        bst.printInOrder(); //
      }
      catch(FileNotFoundException e){
         System.out.println("File not found.");
      }
   }
}
