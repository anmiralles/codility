/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.angelmiralles.codility.lesson01;

import java.util.Arrays;


/**
 *
 * @author angelmiralles
 */
public class PermMissingElem {
    
    
    private static int solution(int A[]){
        int resultado=0;
        
        // Ordenamos el array
        Arrays.sort(A);
        
        // Recorremos el array
        for(int i=0;i<A.length;i++){
            // Comparamos numeros consecutivos
            if(A[i+1]-(A[i]+1)!=0){
                resultado=i+2;
                break;
            }
        }
        
        return resultado;
    }
    
    
    public static void main(String args[]){
       
        int A[]=new int[]{2,3,1,5,4,7};
        
        System.out.println("El resultado es: " + solution(A));
    }
}
