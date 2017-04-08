
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mngvan003
 */
public class BinaryTreeNodeTest {
    BinaryTreeNode n;
    String p;
    BinaryTreeNode j;
    BinaryTreeNode g;

    public BinaryTreeNodeTest() {
        p = "Lilly";
    }
    
    @Before
    public void setUp() {
        n = new BinaryTreeNode("tammi", null, null);
        j = new BinaryTreeNode("zuko", null,null);
        g = new BinaryTreeNode(p,j,n);
        
    }
    
    /**
     * Test of getElement method, of class BinaryTreeNode.
     */
    @Test
    public void testGetElement() {
        System.out.println("getElement");
        String expResult = "Lilly";
        String result = g.getElement();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLeft method, of class BinaryTreeNode.
     */
    @Test
    public void testGetLeft() {
        System.out.println("getLeft");
        BinaryTreeNode instance = new BinaryTreeNode();
        BinaryTreeNode expResult = null;
        BinaryTreeNode result = instance.getLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRight method, of class BinaryTreeNode.
     */
    @Test
    public void testGetRight() {
        System.out.println("getRight");
        BinaryTreeNode instance = new BinaryTreeNode();
        BinaryTreeNode expResult = null;
        BinaryTreeNode result = instance.getRight();
        assertEquals(expResult, result);
    }

    /**
     * Test of printInOrder method, of class BinaryTreeNode.
     */
    @Test
    public void testPrintInOrder() {
        System.out.println("printInOrder");
        g.printInOrder();
        
    }
    
}
