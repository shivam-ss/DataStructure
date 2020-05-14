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
class  NodeLL{
    int data;
    NodeLL next;
    
    NodeLL(int key){
        data=key;
        next=null;
    }
}
public class LinkedList {
    NodeLL head;
}

class test4{
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.head=new NodeLL(10);
        NodeLL second=new NodeLL(20);
        ll.head.next=second;
        
        second.next=new NodeLL(30);
        
    }
}
