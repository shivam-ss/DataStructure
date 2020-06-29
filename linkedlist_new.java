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
import java.util.*;

public class linkedlist_new {
    public static void main(String[] args){
        LinkedList <String>a=new LinkedList<String>();
        a.add("shivam");
        a.add("abcd");
        a.add("cat");
        a.add("bag");
        System.out.println(a);
        Collections.sort(a); //nothing will happen, LL cant be sorted
        
        a.remove(0); //removoes 0th element
        
        Iterator itr=a.descendingIterator(); //reverse iteration
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        
        
    }
    
}
