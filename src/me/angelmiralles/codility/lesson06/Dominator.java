/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.angelmiralles.codility.lesson06;

import java.util.Arrays;

/**
 *
 * @author angelmiralles
 */
public class Dominator {
    
    private static int A[]=new int[]{3,2,3,4,3,3,3,-1};
    private static int O[]=new int[A.length];

    public int[] getA() {
        return A;
    }

    public void setA(int[] A) {
        this.A = A;
    }

    public static int[] getO() {
        return O;
    }

    public static void setO(int[] O) {
        Dominator.O = O;
    }

    /**
     * Metodo para calcular solucion
     * @param A
     * @return 
     */
    private static int solution(int A[]){
        int i=0,j=0,res=0,max=0;
        
        // Ordenamos el array
        Arrays.sort(A);
        
        // Recorremos y almacenamos el número de ocurrencias
        while(i<A.length){
            int cont=0;
            
            // Elemento que vamos a contar sus ocurrencias
            int ele = A[i];            
            
            // Recorremos contando
            while(i<A.length && ele==A[i]){
                cont++;
                i++;
            }
            
            O[j]=cont;
            j++;
        }
        
        Arrays.sort(O);
        
        max = calculaMax(O);
        
        if(max<=(A.length/2))
            res= -1;
        
        return res;
    }
    
    /**
     * Metodo para calcular maximo de un aarray
     * @param A
     * @return 
     */
    private static int calculaMax(int A[]){
        int res=0;
        for(Integer i:A){
            if(i>res)
                res=i;
        }
        return res;
    }
    
    public static void main(String args[]){
        if(solution(A)==-1)
            System.out.println("No existe maximo factor.");
        else
            System.out.println("El resultado es: " + Arrays.toString(O));
    }
}
