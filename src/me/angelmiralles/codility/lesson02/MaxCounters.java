/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.angelmiralles.codility.lesson02;

import java.util.Arrays;

/**
 *
 * @author angelmiralles
 */
public class MaxCounters {
    
    private static int[] solution(int N, int A[]){
        int resultado[]=new int[N];
        
        for(int i=0;i<A.length;i++){
            int ele=A[i];
            int max=0;
                    
            if(1<=ele && ele<=N){
                resultado[ele-1]++;
            } else{
                max=maximum(resultado);
                
                Arrays.fill(resultado, max);
            }
        }
        
        return resultado;
    }
    
    private static int maximum(int A[]){
        int resultado=0;
        
        // Ordenamos
        Arrays.sort(A);
        
        // Obtenemos elemento maximo
        for(int i=0;i<A.length;i++){
            if(A[i]>resultado)
                resultado=A[i];
        }
        
        return resultado;
    }
    
    
    public static void main(String args[]){
        
        int A[]=new int[]{3,4,4,6,1,4,4};
        int N = 5;
        
        int res[]=new int[N];
        res = solution(N,A);
        
        System.out.println("El resultado es: "+ Arrays.toString(res));
    }
}
