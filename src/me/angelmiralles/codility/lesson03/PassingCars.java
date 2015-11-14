/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.angelmiralles.codility.lesson03;

import java.util.Arrays;

/**
 *
 * @author angelmiralles
 */
public class PassingCars {
    
    
    private static int solution(int A[]){
        int resultado=0;
        
        for(int i=0;i<A.length-1;i++){
            int ele1 = A[i];
            if(ele1==0){
                for(int j=i+1;j<A.length;j++){
                    int ele2=A[j];
                    if(ele2==1)
                        resultado++;
                }
            }
        }
        
        return resultado;
    }
    
    public static void main(String args[]){
        
        int A[]=new int[]{0,1,0,1,1};
                
        System.out.println("El resultado es: "+ solution(A));
    }
}
