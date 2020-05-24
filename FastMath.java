/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author shiva
 */
import java.util.*;
public class FastMath {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Left shift for multiplication by 2
        long n=sc.nextLong();
        long a=n<<1;
        System.out.println("N*2="+a);
        
        long b=n>>1;
        System.out.println("N/2="+b);
        
    }
}
