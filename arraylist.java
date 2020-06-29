/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author shivam srivastava
 */
import java.util.*;

public class arraylist {
    public static void main(String[] args){
       ArrayList <Integer> a=new ArrayList<Integer>();
       a.add(5);
       a.add(10);
       a.add(5);
       a.add(70);
       a.isEmpty();
       System.out.println(a); // gives output in form f a list [1,2,3,4.......]
       
       
       Collections.sort(a);//to sort the list
       
       //to get the size: 
       a.size();
       a.get(1); //gets element from specified location
       
       Iterator itr=a.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
    }
}

// create your own data types, means class and do replace the datatype given here with that
// now, you have multi-valued kind  of list array, what i needed on hackerrank
