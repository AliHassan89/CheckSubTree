/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author Ali
 */
public class Node {
    public Integer data;
    public Node left;
    public Node right;
    
    public Node()
    {
        data = -1;
        left = null;
        right = null;
    }
    
    public Node(Integer val)
    {
        data = val;
        left = null;
        right = null;
    }
}
