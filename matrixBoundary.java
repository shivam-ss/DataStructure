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
//sum of boundary elements of a 2D array: 
import java.util.*;

public class matrixBoundary {
    public int row,col;
    void matrix(int m, int n){
        row=m;
        col=n;
        int[][] arr=new int [row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter element of  matrix at postion: "+(i+1)+","+(j+1));
            Scanner sc=new Scanner(System.in);
            arr[i][j]=sc.nextInt();
        }
        }
        int sum=0;
        
        //finding out the corner elements, if not, add to sum
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0){
                    sum+=arr[i][j];
                }
                else if(i==col-1){
                    sum+=arr[i][j];
                }
                else if(j==row-1){
                    sum+=arr[i][j];
                }
                else if(j==0){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of boundary elements of the matrix is  : "+sum);
    }
    public static void main(String[] args){
        matrixBoundary obj=new matrixBoundary();
        obj.matrix(4,4);
    }
    
}
