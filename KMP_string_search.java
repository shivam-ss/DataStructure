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
public class KMP_string_search {
    void KMPSearch(String pat, String txt){
        int M=pat.length();
        int N=txt.length();
        
        int []lps=new int[M];      //lps will hold the longest prefix suffix values for the pattern
        
        compute_lps_array(pat,M,lps);
        
        int i=0; // index for txt[]
        while(i<M){
            
        }
        
    }
    
    void compute_lps_array(String pat, int M, int lps[]){
        //length of previous longest prefix suffix:
        int len=0;
        int i=1;
        lps[0]=0;   //lps 0 is always 0
        
        
    }
}
