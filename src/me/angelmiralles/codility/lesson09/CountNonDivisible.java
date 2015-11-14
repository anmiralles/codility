/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.angelmiralles.codility.lesson09;

import java.util.Arrays;

/**
 *
 * @author angelmiralles
 */
public class CountNonDivisible {
    
    
    private static int[] solution(int A[]){
        int res[]=new int[A.length];
        
        for(int i=0;i<A.length;i++){
            int cont=0;
            for(int j=0;j<A.length;j++){
                if(A[i]%A[j]!=0)
                    cont++;
            }
            res[i]=cont;
        }
        
        return res;
    }
    
    public static void main(String args[]){
        
        int A[]=new int[]{3,1,2,3,6};
        
        System.out.println("Funciona: "+Arrays.toString(solution(A)));
    }
}
