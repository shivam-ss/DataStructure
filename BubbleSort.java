/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;
import java.util.*;
/**
 *
 * @author shiva
 */
public class BubbleSort {
    
    void sort(){
        int inner, outer;
        System.out.println("Enter size of array : ");
        Scanner sc=new Scanner(System.in);
        int temp;
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at "+i+"th index");
             Scanner sc2=new Scanner(System.in);
             arr[i]=sc2.nextInt();
        }
        for(outer=arr.length-1;outer>1;outer--){
            for(inner=0;inner<outer;inner++){
                if(arr[inner]>arr[inner+1]){
                 temp=arr[inner];
                 arr[inner]=arr[inner+1];
                 arr[inner+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Array sorted: "+arr[i]);
        }
        
        
    }
    
    public static void main(String[] args){
        BubbleSort obj = new BubbleSort();
        obj.sort();
    }
}
