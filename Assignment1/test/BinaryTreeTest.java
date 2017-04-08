/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vanessa Manganyi
 */
public class BinaryTreeTest {
    BinaryTree M = new BinaryTree();
    
    /**
     * Test of getRoot method, of class BinaryTree.
     */
    @Test
    public void testGetRoot() {
        System.out.println("getRoot");
        BinaryTreeNode expResult = null;
        BinaryTreeNode result;
        result = M.getRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         // fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class BinaryTree.
     */
    @Test
    public void testIsEmpty() {
        boolean expResult = true;
        boolean result = M.isEmpty();
        assertEquals("isEmpty", expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //il("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class BinaryTree.
     */
    @Test
    public void testInsert_String() {
        System.out.println("insert");
        String p = "";
        BinaryTree instance = new BinaryTree();
        instance.insert(p);
        boolean i = false;
        boolean r = instance.isEmpty();
        assertEquals("Insert", i,r);
    }
    /**
     * Test of find method, of class BinaryTree.
     */
    @Test
    public void testFind_String() {
        System.out.println("find");
        String d = "Vanessa Manganyi";
        BinaryTree instance = new BinaryTree();
        String expResult = "Not found";
        String result = instance.find(d);
        assertEquals(expResult, result);
    }
   
    
}
