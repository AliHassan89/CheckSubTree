/*

Check Subtree: Tl and T2 are two very large binary trees, with Tl much bigger 
than T2. Create an algorithm to determine if T2 is a subtree of Tl.
A tree T2 is a subtree of Tl if there exists a node n in Tl such that the 
subtree of n is identical to T2. That is, if you cut off the tree at node n, 
the two trees would be identical.


Solution explanation:

in following test case I have created following two trees:

t1 =                 15
                   /    \
                  9      18
                 / \    /  \
                4  12  17  25
                             \
                             28


t2 =                18
                   /  \
                  17  25
                        \
                        28

Using preOrderTraversal of the tree we can find out and compare the two 
generated lists. Making sure to insert null when the value of the object is null 

 */

package cci_chap4_checksubtree;

import bst.BST;
import bst.Node;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ali
 */
public class CCI_Chap4_CheckSubTree 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        BST t1 = new BST();
        
        Node r1 = t1.insertNode(new Node(15), null);
        t1.insertNode(new Node(9), r1);
        t1.insertNode(new Node(18), r1);
        t1.insertNode(new Node(4), r1);
        t1.insertNode(new Node(12), r1);
        t1.insertNode(new Node(17), r1);
        t1.insertNode(new Node(25), r1);
        t1.insertNode(new Node(28), r1);
        
        BST t2 = new BST();
        Node r2 = t2.insertNode(new Node(18), null);
        t2.insertNode(new Node(17), r2);
        t2.insertNode(new Node(25), r2);
        t2.insertNode(new Node(28), r2);
        
        ArrayList<Integer> list1 = t1.preOrderTraversal(r1);
        ArrayList<Integer> list2 = t2.preOrderTraversal(r2);
        
        System.out.println(Collections.indexOfSubList(list1, list2) != -1);
    }    
}
