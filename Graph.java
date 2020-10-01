/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shivam
 */
import java.util.*;

public class Graph {
    int v; //number of vertices
    ArrayList <ArrayList<Integer>> adj;
    
    Graph(int V){
        v=V;
        adj=new ArrayList<ArrayList<Integer>>(v);
        
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
    }
    
    void addEdge(int u,int v){
        adj.get(u).add(v);
        
    }
    
    void printGraph(){
        //it will be like : edge-> all connecting edges: 
        for(int i=0;i<adj.size();i++){
            System.out.print(i + "-->");
            
            //now, printing all edges connected to it:
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j));
            }
            System.out.println("");
        }
    }
    
    
    void BFS(int source){
        boolean visited[]=new boolean[v]; //boolean array of size v
        
        //queue: 
        LinkedList<Integer> queue=new LinkedList<Integer>();
        
        visited[source]=true;
        queue.add(source);
        
        while(!queue.isEmpty()){
            //deque and print : 
            source=queue.poll();   //removes the last element
            System.out.print( source + "  ");
            
            //getting all adj vertices of dequeued nad marking it as visited if not visited;
            
            Iterator <Integer> i= adj.get(source).listIterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
            
        }
    }
    
    
    void DFS(int source){
        boolean visited[] = new boolean[v];
        DFShelper(source, visited);
    }
    
    void DFShelper(int source, boolean visited[]){
        visited[source]=true; 
        System.out.println(source+ "  ");
        
        Iterator <Integer> i=adj.get(source).listIterator();
        while(i.hasNext()){
            int n=i.next();
            if(!visited[n]){
            DFShelper(n,visited);
            }
        }
    }
    
    
    
    
}

class testGraph{
    public static void main(String[] args) {
        Graph g=new Graph(4);
         g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        
        g.printGraph();
        
        System.out.println("BFS IS : ");
        
        g.BFS(0);
        
        System.out.println("  \n DFS IS : ");
        g.DFS(2);
    }
}


