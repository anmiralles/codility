/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.angelmiralles.codility.lesson07;

/**
 *
 * @author angelmiralles
 */
public class MaxSliceSum {
 
    private static int solution(int A[]){
        int res=0;
        
        for(int i=0;i<A.length-1;i++){
            int slice=A[i]+A[i+1];
            
            if(slice>res)
                res=slice;
        }
        
        return res;
    }
    
    public static void main(String args[]){
        int A[]=new int[]{3,2,-6,4,0};
        
        System.out.println("El resultado es: "+solution(A));
    }
}
