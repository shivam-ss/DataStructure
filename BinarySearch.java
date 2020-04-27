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
public class BinarySearch {
    public int arr[];
    public int size;
    int count =0;
    void array(int arrsize){
        size=arrsize;
         arr= new int[size];
    }
    void insert(int data){
        
        arr[count]=data;
        count++;
    } 
    int search(int data){
        int LowerBound=0;
        int UpperBound=size-1;
        int mid;
        while(true){
            mid=(LowerBound+UpperBound)/2;
            if(arr[mid]==data){
               return mid;
            }
            else if(LowerBound>UpperBound){
                return 3214; //cant find
                     //System.out.println("Not found");
            }
            else {
                if(arr[mid]<data){
                    LowerBound=mid+1;
                }
                else{
                    UpperBound=mid-1;
                }
                
                
            }
        }
        
    }
    
}

class test1{
    public static void main(String[] args){
        BinarySearch obj=new BinarySearch();
        obj.array(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.insert(60);
        obj.insert(70);
        obj.insert(80);
        obj.insert(90);
        obj.insert(100); //sorted data
        
        if(obj.search(10)!=10){   //searching 10 until size of array is complete or 10 is found
            System.out.println("Found 10");
        }
        else{
            System.out.println("Not found");
        }
        
        
    }
}
