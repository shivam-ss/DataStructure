/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Scanner;

/**
 *
 * @author shivam
 */
public class matrixOperations { 
    
    public static void main(String[] args){
        int row=2;
        int col=2;
        int[][] m1= new int[row][col];
        int[][] m2=new int[row][col];
        
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
                
                        System.out.println(m1[i][j]+" ");
            }
        }
        
        System.out.println("Printing matrix m2: ");
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                        System.out.println(m2[i][j]+" ");
            }
            System.out.println();
        }
        
        //ADDITION OF TWO MATRCIES:
        int sum[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum[i][j]=m1[i][j]+m2[i][j];
            }
        }
        
        System.out.println("ADDITION OF MATRIX: ");
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                        System.out.println(sum[i][j]+" ");
            }
            System.out.println();
        }
         
         // If taking matrix of variable specified by useer, check if col1 !=row2, then matrix cant be multiplied.
         int mul[][]=new int[row][col];
         
         for(int i=0;i<row;i++){
             for(int j=0;j<col;j++){
                 mul[i][j]=mul[i][j]+m1[i][j]*m2[i][j];
             }
         }
                 
         System.out.println("PRODUCT OF MATRIX: ");
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                        System.out.println(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}
