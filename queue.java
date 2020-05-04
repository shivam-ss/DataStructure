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
public class queue {
    int size;
    int len;
    int arr[];
    int front;
    int rear;
    
    queue(int a){
        size=a;
        arr=new int[size];
        front=-1;
        rear=-1;
        len=0; // initially no elements in queue
    }
    // check if queue is empty
    boolean isEmpty(){
        return front==-1;
    }
    boolean isFull(){
        return front==0 && rear==size-1;
    }
    int peak(){
        if(isEmpty()){
            System.out.println("QUEUE IS EMPTY");
        }
        System.out.println(arr[front]);
        return arr[front];
    }
    
    void insert(int x){   ///// HAVE TO MODIFY THIS PART
        if(isFull()){
            System.out.println("QUEUE IS FULL");
        }
        else 
        {
            if(front==-1){
            front =0;
            rear++;
            arr[rear]=x;
            System.out.println("Inserted : "+x);
        }
        }
    }
    
    int remove(){
        int temp;
        if(isEmpty()){
            System.out.println("QUEUE IS Empty");
            return -1;
        }
        else{
            temp=arr[front];
            if(front>=rear){ //on;y one element in the queue
                //set front and rear to -1, as in empty queue
                front=-1;
                rear=-1;
            }
            else{
                front++;
                System.out.println("Deleted : "+temp);
            }
        
        }
        return temp;
    }
    
    void printQueue(){
        if(isEmpty()){
            System.out.println("QUEUE IS EMPTY, FROM PRINT QUEUE");
        }
        else{
            System.out.println("FRONT ="+front);
            for(int i=front;i<=rear;i++){
                System.out.println("Queue["+i+"]:"+arr[i]);
                System.out.println("Rear: "+rear);
            }
        }
    }
    public static void main(String[] args){
        queue obj=new queue(10);
        obj.insert(5);
        obj.insert(50);
        obj.insert(10);
        obj.printQueue();
    }
}
