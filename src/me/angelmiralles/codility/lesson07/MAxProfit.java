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
public class MAxProfit {
    
    private static int solution(int A[]){
        int res=0;
        
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                int profit=A[j]-A[i];
                
                if(profit>0 && profit>res)
                    res=profit;
            }
        }
        
        return res;
    }
    
    public static void main(String args[]){
        int A[]=new int[]{23171, 21011, 21123, 21366, 21013, 21367};
        
        System.out.println("El resultado es: "+solution(A));
    }
}
