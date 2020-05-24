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
import java.math.*;
public class MSB {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        double K=   Math.log10(a);
        K=K-Math.floor(K);
        int msb=(int)Math.pow(10, K);
        System.out.println("MSB is : "+msb);
    }
    
}
