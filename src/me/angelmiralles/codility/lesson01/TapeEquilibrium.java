/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.angelmiralles.codility.lesson01;

/**
 *
 * @author angelmiralles
 */
public class TapeEquilibrium {
    
    /**
     * Metodo para calcula minimo valor absoluto equilibrado
     * @param A
     * @param N
     * @return 
     */
    private static int solution(int A[], int N){
        int resultado=Integer.MAX_VALUE;
        
        for(int i=0;i<N;i++){
            int sum1=0, sum2=0;
            int resta=0;
            
            // Suma elementos de la izquierda
            for(int j=0;j<=i;j++){
                sum1=sum1+A[j];
            }
            
            // Suma elementos de la derecha
            for(int k=i+1;k<N;k++){
                sum2=sum2+A[k];
            }
            
            // Calculamos valor absoluto de resta
            resta = Math.abs(sum1-sum2);
            
            // Almacena variable con menor valor
            if(resta<resultado){
                resultado=resta;
            } 
            
        }
        
        return resultado;
    }
    
    public static void main(String args[]){
       
        int A[]=new int[]{3,1,2,4,3};
        int N = A.length;
        
        System.out.println("El resultado es: " + solution(A, N));
    }
            
}
