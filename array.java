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
public class array {
    
    int size;
    int arr[];
    void createArray(int size){
         arr=new int[size];
         System.out.println("Created an array of size : "+size);
    }
    
    void insert(int data, int index){
    
        arr[index]=data;
        System.out.println("Inserted into array : "+data+" at "+ index + "th index" );
        
        
        
    }
    
    void search(int data){
      //  System.out.println("debugging");
        
         
        for(int i=0;i<arr.length;i++){     
            if(arr[i] == data){   // use .equals method for strings
                System.out.println("Found "+data+" at "+i+"th index");
            }
            else{
                 System.out.println("Not Found "+data+" to delete");
            }
            break;
        }
    }
    
    void delete(int data){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == data){
                arr[i]=arr[i+1];
                System.out.println("Data deleted :" +data);
                break;
            }
            
            
            
            
        }
        
    }
   
        
    
    
}

class test{
    public static void main(String[] args){
        array a= new array();
        a.createArray(5);
        a.insert(10,0);
        a.insert(20,1);
        a.insert(30,3);
        a.search(10);
        a.delete(20);
        a.search(20);
        
    }
}
