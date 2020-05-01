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
public class InsertionSort {
    void search(){
        System.out.println("ENTER SIZE OF ARRAY: ");
        int size;
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element at index : "+i);
            Scanner sc2=new Scanner(System.in);
            arr[i]=sc2.nextInt();
        }
            //APPLYING INSERTION SORT: 
            int key,j;
            for(int i=1;i<arr.length;i++){
                key=arr[i];
                j=i-1;  // start from j=0
                // now, compare j elements with key element and swap if arr[j]>key
                while(j>=0 && arr[j]>key ){
                    arr[j+1]=arr[j];
                    j=j-1;
                }
                arr[j+1]=key;
            }
            
            for(int i=0;i<arr.length;i++){
            System.out.println("Sorted array, index:" + i +"element: "+arr[i] );
           
        }
        }
    

    public static void main(String [] args){
        InsertionSort obj=new InsertionSort();
        obj.search();
    }
}
