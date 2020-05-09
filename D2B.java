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
public class D2B {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER IN DECIMAL: ");
        int x=sc.nextInt();
        String binary="";
        if(x==0){
                binary="0".concat(binary);
            }
        else{
        while(x>0){
            
             if(x==1){
                binary="1".concat(binary);
            }
            else  if(x%2==0){
            binary="0".concat(binary);
            
            }
        
            else{
            binary="1".concat(binary);
    
                    
                    }
        x=x/2;
        }
        System.out.println("Binary is : "+binary);
        }
    }
}
