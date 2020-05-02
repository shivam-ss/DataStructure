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
public class stack {
    int size;
    int arr[];
    int top;
    stack(int a){
        size=a;
        arr=new int[size];
        top=-1; /// initializing -1 to show stack is empty initially
    }
    boolean isFull(){
        
        return top==size-1; // comparing if top element is equal to last index of array
    }
    boolean isEmpty(){
        return top==-1;  // comparing if top is empty, true if yes
    }
    int sizeofstack(){
        return top+1;
    }
    void push(int x){
        if(isFull()){
            System.out.println("OVERFLOW !!!!!!!!");
            System.exit(0);
        }
        arr[++top]=x;
        System.out.println("INSERTING :"+x);
        
    }
    int pop(){
        if(isEmpty()){
            System.out.println("UNDERFLOW !!!!!!!!");
            System.exit(0);
        }
        else{
       // return arr[top--];
        System.out.print("POPPING "+arr[top]);
        return arr[top--];
        }
        return arr[top];
    }
    
    public static void main(String[] args){
        stack obj=new stack(5);
        obj.push(100);
        obj.pop();
        obj.pop();
    }
    
}
