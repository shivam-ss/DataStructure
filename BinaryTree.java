/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author shivam
 */
/// creating a class named Node
 class Node{
    int key;
    Node right; // because right and left will aslo have same things like key and right and left
    Node left;
    Node(int item){
        key=item;
        right=null;
        left=null;
    }
    
}
public class BinaryTree {  // we will create object of this as it will be our binary tree
    //creating root node:
    
    Node root; // only declaring here
    
    BinaryTree(int key){
        root=new Node(key);  // assigning memory as well as the key value here  to root
    }
    BinaryTree(){             //default constructor
        root=null;  
    }
    // writing a fucntion to print the binary tree
}

class test3{
    public static void main(String[] args){
        BinaryTree obj=new BinaryTree();
        obj.root=new Node(100);
        obj.root.right=new Node(300);
        obj.root.left=new Node(50);
        obj.root.left.right=new Node(20);
        obj.root.left.left=new Node(2);
    }
    
}
