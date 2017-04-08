/**
 *@author Vanessa Manganyi
 *Binary Tree Node: Creates nodes that will be stored in a binary search tree. 
 *Each node holds the String of data and two Binary Node pointers.
 *One points to the next left child and the other the right.
 */


public class BinaryTreeNode{
   String data;
   BinaryTreeNode left;
   BinaryTreeNode right;
   
/**
*default constructor: sets  data, left and right to null
*/ 
   public BinaryTreeNode( ){
    this( null, null, null ); 
    }

/**
*parameterized constructor:
*@param d value of data
*@param lt reference of left child
*@param rt reference of right child
*/ 
   public BinaryTreeNode( String d, BinaryTreeNode lt, BinaryTreeNode rt ){
      data = d; 
      left = lt; 
      right = rt; 
   }

/**
*returns the data value
*@returns String
*/     
   public String getElement( ){
      return data; 
   }

/**
*returns the reference of the left node
*@returns left BinaryTreeNode
*/
   public BinaryTreeNode getLeft( ){
      return left;
   }

/**
*returns the data value
*@returns Right BinaryTreeNode
*/   
   public BinaryTreeNode getRight( ){
      return right; 
   }

/**
*Method to print String items in the nodes in order
*First checks if the left node is equal to null, if not, it prints the String in the left node
*It then checks if the right node is equal to null, if not, it prints the String in the right node
*/  
   public void printInOrder( ){
      if( left != null )
         left.printInOrder( );
      System.out.println(data);
       
      if( right != null )
         right.printInOrder( ); 
   }
}
