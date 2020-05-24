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

public class OddEven {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        
        System.out.println((a&1)==0 ? "EVEN" : "ODD");
    }
    
}
