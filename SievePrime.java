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
Part 1: successfully implemented
 */

//in sieve of eratosthenes method, strat from 2, mark all multiples of 2, then move to next unmarked element and so on; mark elements which are greater than
// divisible by 2, or grater than or euqla to square of it, repeat same for all unmarked elements.
public class SievePrime {
    public static void main(String[] args){
        
        
        
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        //Create a list of all elements, and mark them all true initially;
        boolean arr[]=new boolean[n+1];
        for(int i=0;i<n;i++){
            arr[i]=true; // marking all elements as prime
        }
        
        for(int p=2;p*p<=n;p++){
            //after loop, if arr[p] isnt changes, it is prime
            if(arr[p]==true){
                // Mark all multiples of i
                for(int i=p*p;i<=n;i=i+p){  // example, i=2*2, 4 will be set to false, 2+2=4, i=16, marked it as false and so on
                    arr[i]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
           if(arr[i]==true){
               System.out.println(i);
           }
        }
        
    }
}
