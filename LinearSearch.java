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

// same as a search in array
public class LinearSearch {
       public int arr[]=new int[100];
    void insert(int data,int index){
               arr[index]=data;        
        
        
    }
    
    void search(int data){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                System.out.println("Found "+data+ "at index : "+i);
            }
        }
    }
    public static void main(String[] args){
        LinearSearch obj=new LinearSearch();
        obj.insert(10, 0);
        obj.insert(20, 1);
        obj.search(20);
    }
    
}
