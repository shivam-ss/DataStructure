/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author shivam
 * Heaps are j=data structure in which insertion/deletion happens at end/root node and the minHeapify or maxHeapify methods are called
 * Time complexity is O(log(n))
 * parent index of any given index= (i-1/2)th index
 * left child of any given index i= 2*i+1
 * right child of any given index i= 2*i+2
 * // these measurements are for arrays, since implementation has size i+1 already, so dont use 
 * minHeap is a complete binary tree and is represented as an array
 */
public class Heap {
    //common properties:
    int size;
    int []Heap;
    int maxSize;
    
    static final int FRONT=1;
    
    public Heap(int maxSize){
        this.maxSize=maxSize;  // ctor, assiging values to the object
        this.size=0;
        Heap=new int[this.maxSize+1]; // heaps go all the way from 0th index to ith index, unlike arrays
        Heap[0]=Integer.MIN_VALUE; ///inintially the root will have the minimum value , change to MAX_VALUE for maxHeap
        
    }
    
    //getting parent index:
    private int parent(int position){
        int par=position/2;
        return par;
        
    }
    
    private int rightChild(int position){
        int rc=position*2+1;   //because we are using size+1
        return rc;
        
    }
    
    private int leftChild(int position){
        int lc=position*2;  //because we are using size+1
        return lc;
    }
    
    
    // checking if an element is leaf node or not
    private boolean isLeaf(int position){
        if(position>=size/2 && position<size){ // because it is a complete binary tree, so leaf nodes will be at half or more than half of size
            return true;
        }
        else{
        return false;
        }
    }
    
    private void insert(int element){
        if(size>=maxSize){
            return;
        }
        Heap[size++]=element;
        int current=size; //current size
        while(Heap[current]>Heap[parent(current)]){
            swap(current,parent(current));
            current=parent(current);
        }
    }
    private void swap(int pos1,int pos2){
        int temp=Heap[pos1];
        Heap[pos1]=Heap[pos2];
        Heap[pos2]=temp;
    }
    
    private void minHeapify(int position){  
        
        //if node is not a lead node and it is greater than any of its child nodes:
        if(!isLeaf(position)){
            //check if parent element is gretaer than child, swap if yes
            if(Heap[position]>Heap[leftChild(position)] || Heap[position]<Heap[rightChild(position)]){  
                //swap with the left child and heapify the right child
                if(Heap[leftChild(position)]>Heap[rightChild(position)]){
                    swap(position,leftChild(position));
                    minHeapify(leftChild(position));
                }
                else{
                    swap(position,rightChild(position));
                    minHeapify(rightChild(position));;
                }
            }
        }
        
        
    }
    
    public void minHeap(){
        int pos;
        for(pos=size/2;pos>=1;pos--){
            minHeapify(pos);
        }
    }
    
    public int remove(){
        int pop=Heap[FRONT];
        Heap[FRONT]=Heap[size--];
        minHeapify(FRONT);
        return pop;
    }
    
    public void print(){
        for(int i=1;i<=size/2;i++){
            System.out.println("PARENT ELEMENT: "+Heap[i]);
            System.out.print("Left CHILD ELEMENT: "+Heap[2*i]);
            System.out.print("Right CHILD ELEMENT: "+Heap[2*i+1]);
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Heap minHeap=new Heap(20);
        minHeap.insert(100);
        minHeap.insert(200);
        minHeap.insert(0);
        minHeap.insert(45);
        minHeap.insert(12);
        minHeap.insert(96);
        minHeap.insert(10);
        minHeap.insert(63);
        
        minHeap.print();
    }
    
    
    
    
}
