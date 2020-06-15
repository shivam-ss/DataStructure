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
public class BinarySearchTree {
    
    
     
    //class node inside BST class
    class Node{
        int key;
        Node left;
        Node right;
    
        public Node(int item){
            key=item;
            left=null;
            right=null;
        }
    }
        
        //creating root of BST:
    Node root;
            BinarySearchTree(){
            root=null; //
              }
            
        void insert(int key){
            root=insertRecord(root,key);
        }
        
        Node insertRecord(Node root, int key){
            //Returning a newly created Node if tree is empty
            if(root==null){
                root=new Node(key);
                return root; 
            }
            if(key<root.key){
                root.left=insertRecord(root.left,key);
               
            }
            else if(key>root.key)
                root.right=insertRecord(root.right,key);
            
            
            return root;
        }
        void inorder(){
            inorderRecord(root);
            
        }
        void inorderRecord(Node root){
            if(root !=null){
                inorderRecord(root.left);
                System.out.println(root.key);
                inorderRecord(root.right);
                
            }
        }
        
        
        
        public static void main(String[] args){
            BinarySearchTree obj=new BinarySearchTree();
            obj.insert(50);
            obj.insert(10);
            obj.insert(60);
            obj.insert(45);
            obj.insert(52);
            obj.insert(11);
            obj.insert(32);
            obj.insert(78);
            obj.insert(100);
            obj.insert(200);
            obj.insert(2);
            obj.insert(99);
            obj.insert(100);
            
            obj.inorder();
        }
        
        
        
            
}
