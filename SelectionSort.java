/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;
import java.util.*;
/**
 *
 * @author shivam
 */
public class SelectionSort {
    
    void sort(){
        int size;
        System.out.println("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        int temp;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element : "+ i);
            Scanner sc2=new Scanner(System.in);
            arr[i]=sc2.nextInt();
        }
        int out, in, min; //select a number from outer loop as min:
        for(out=0;out<arr.length-1;out++){
            min=out;
            // to find minimum element in the unsorted array
            for(in=out+1;in<arr.length;in++)
               if(arr[in]<arr[min])
                   min=in;
            //swapping the min element with the first element
            temp=arr[min];
            arr[min]=arr[out];
            arr[out]=temp;
               
            
        }
        System.out.println("Array after sorting is :  ");
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]"+arr[i]);
            
        }
    }
   
    public static void main(String[] args){
            SelectionSort obj=new SelectionSort();
            obj.sort();
            
        }
    
}
