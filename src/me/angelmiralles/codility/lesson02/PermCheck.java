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
public class PermCheck {
 
    private static int solution(int A[], int N){
        int resultado=1;
        
        // Ordenamos array de menor a mayor
        Arrays.sort(A);
        
        for(int i=0;i<N-1;i++){
            if(A[i]+1!=A[i+1]){
                resultado=0;
                break;
            }
        }
        
        return resultado;
    }
    
    
    public static void main(String args[]){
        int A[]= new int[]{4,2,1,3,5,7,6};
        
        System.out.println("El resultado es: " + solution(A, A.length));
    }
}
