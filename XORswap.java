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
public class XORswap {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc2.nextLong();
        System.out.println("Before swapping,: a="+a+" \n b="+b);
        a^=b;
        b^=a;
        a^=b;
        
        System.out.println("After swapping,: a="+a+" \n b="+b);
    }
}
