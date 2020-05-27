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
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
  
public class FasterIO 
{ 
    public static void main(String[] args) throws IOException 
    { 
  
        BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in)); 
  
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        int n = Integer.parseInt(st.nextToken()); 
        int k = Integer.parseInt(st.nextToken()); 
        int count = 0; 
        while (n-- > 0) 
        { 
            int x = Integer.parseInt(br.readLine()); 
            if (x%k == 0) 
               count++; 
        } 
        System.out.println(count); 
    } 
} 

// FROM GEEKSFORGEEKS, will be modifying and using it for my most recent codes


