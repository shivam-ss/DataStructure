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
public class matrix_2D {
    public static void main(String[] args){
        int row=2;
        int col=2;
        int[][] m1= new int[row][col];
        int[][] m2=new int[row][col];
        //try to modify it using some data structure to reduce complexity
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter element of matrix M1: ");
                        Scanner sc=new Scanner(System.in);
                        m1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter element of matrix M1: ");
                        Scanner sc2=new Scanner(System.in);
                        m2[i][j]=sc2.nextInt();
            }
        }
        
        System.out.println("Printing matrix m1: ");
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                        System.out.println("\t "+m1[i][j]);
            }
        }
        
        System.out.println("Printing matrix m2: ");
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                        System.out.println("\t "+m2[i][j]);
            }
        }
                      
    }
}
