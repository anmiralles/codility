/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.angelmiralles.codility.lesson08;

/**
 *
 * @author angelmiralles
 */
public class CountFactors {
    
    private static int solution(int N){
        int res=0,i=N;
        
        while(i>0){
            if(N%i==0)
                res++;
            i--;
        }
        
        return res;
    }
    
    public static void main(String args[]){
        
        int N=24;
        
        System.out.println("Funciona: "+solution(N));
    }
}
