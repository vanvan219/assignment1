/**
*Binary Search Tree code: creates a binary search tree
*/
    
public class BinaryTree{
   private BinaryTreeNode root;
   
    /** 
     *Default Constructor: sets root to null
     */
   public BinaryTree( ){ 
      root = null; 
      }
    /**
     *Constructor: takes in a String item
     * @param rootItem is the string input from the file
     */    
   public BinaryTree( String rootItem ){ 
      root = new BinaryTreeNode( rootItem, null, null ); 
      }

   
    /**
     * returns parent node
     * @return BinaryTreeNode
     */
    public BinaryTreeNode getRoot( ){ 
      return root; 
      }
 
   /**
    *prints the items in the tree in order
    */        
   public void printInOrder( ){ 
      if( root != null ) root.printInOrder( ); 
      }
  
   /**
    *checks if the tree is empty
    * @return  boolean
    */  
   public boolean isEmpty( ){ 
      return root == null; 
      }
    /**
     *inserts, recursively, String item into tree, uses the insert(String d, BinaryTreeNode node) method.
     * @param p String input to be placed in tree
     */     
   public void insert ( String p ){
      if (root == null)
         root = new BinaryTreeNode (p, null, null);
      else
         insert(p, root);
      }
      
   public void insert(String d, BinaryTreeNode node ){
      if (d.compareTo ((String) node.data) < 0){
         if (node.left == null)
            node.left = new BinaryTreeNode(d, null, null);
         else
            insert(d, node.left);
      }
      else if(d.compareTo(node.data)== 0){
         node.data = d;
      }
      else{
         if (node.right == null)
            node.right = new BinaryTreeNode (d, null, null);
         else
            insert (d, node.right);
      }
   }
    /**
     * searches tree to find String d in tree recursively 
     * in conjunction with find (String d, BinaryTreeNode node ). 
     * @param d String input to be found 
     * @return The String item in the tree or "Not Found"
     */   
   public String find (String d ){
      if (root == null)
         return "Not found";
      else
         return find (d, root);
   }
   
   public String find (String d, BinaryTreeNode node ){
      String[] k = node.data.split("\\,");
      String k1 = k[0];
      if (d.compareTo (k1) == 0)
         return node.data;
      else if (d.compareTo (node.data) < 0)
         return (node.left == null) ? null : find (d, node.left);
      else
         return (node.right == null) ? null : find (d, node.right);
    }
}
