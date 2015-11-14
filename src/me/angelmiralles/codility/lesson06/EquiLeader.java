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
public class EquiLeader {
    
    public static int solution(int A[]){
        int res=0;
        
        for(int i=0;i<A.length;i++){
            int resArray[][] = new int[2][A.length];
            int pos = i+1;
            
            resArray = splitArray(A,pos);
            
            int max1 = calMaxArray(resArray[0]);
            int max2 = calMaxArray(resArray[1]);
            
            int num1 = numOccurences(resArray[0], max1);
            int num2 = numOccurences(resArray[1], max2);
            
            if(num1>(pos/2) && num2>((A.length-pos)/2))
                res++;
            
        }
        
        return res;
    }
    
    /**
     * Metodo para calcular maximo entero de un array
     * @param A
     * @return 
     */
    private static int calMaxArray(int A[]){
        int res=0;
        for(Integer i:A){
            if(i>res)
                res=i;
        }
        return res;
    }
    
    /**
     * Metodo para partir array en dos desde pos
     * @param A
     * @param pos
     * @return 
     */
    private static int[][] splitArray(int A[], int pos){
        int res[][]= new int[2][A.length];
        
        // Conformamos split
        System.arraycopy(A, 0, res[0], 0, pos);
        System.arraycopy(A, pos, res[1], pos, A.length - pos);
        
        return res;
    }
    
    
    /**
     * Metodo para contar ocurrencias
     * @param A
     * @param ele
     * @return 
     */
    private static int numOccurences(int A[], int ele){
        int i=0,cont=0;
        
        // Ordenamos el array
        Arrays.sort(A);
        
        // Avanzamos hasta encontrar ele
        while(A[i]<ele)
            i++;

        // Contamos ocurrencias
        while(i<A.length && A[i]==ele){
            i++;
            cont++;
        }
        
        return cont;
    }
    
    
    
    public static void main(String args[]){
        
        int A[] = new int[]{4,3,4,4,4,2};
        
        System.out.println("El resultado es: "+solution(A));
    }
}
