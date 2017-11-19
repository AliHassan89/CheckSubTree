/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import java.util.ArrayList;

/**
 *
 * @author Ali
 */
public class BST 
{   
    public Node insertNode(Node node, Node root)
    {
        if(root == null)
        {
            root = node;
        }
        else if(node.data <= root.data)
            root.left = insertNode(node, root.left);
            
        else
            root.right = insertNode(node, root.right);
        
        return root;
    }
    
    public ArrayList<Integer> preOrderTraversal(Node root)
    {
        ArrayList<Integer> order = new ArrayList<>();
        preOrderTraversal(root, order);
        return order;
    }
    
    private void preOrderTraversal(Node root, ArrayList<Integer> order)
    {
        if (root == null)
        {
            Node n = new Node(null);
            order.add(n.data);
            return;
        }
        
        order.add(root.data);
        preOrderTraversal(root.left, order);
        preOrderTraversal(root.right, order);
    }
}