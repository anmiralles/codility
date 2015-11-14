/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.angelmiralles.codility.lesson05;

import java.util.Stack;

/**
 *
 * @author angelmiralles
 */
public class Fish {
    
    private static int solution(int A[], int B[]){
        int result=0;
        Stack<Integer> pila= new Stack<>();
        
        for(int i=0;i<A.length;i++){
            
            if(B[i]==0){
             
                while(!pila.empty() && A[i]<pila.peek()){
                    pila.pop();
                }
                
                if(pila.empty())
                    result++;
                
            }else{
                pila.push(i);
            }
                    
        }
        
        result=result+pila.size();
        
        return result;
    }
    
    public static void main(String args[]){
        int A[]=new int[]{4,3,2,1,5};
        int B[]=new int[]{0,1,0,0,0};
        
        System.out.println("El resultado es: " + solution(A,B));
    }
}
