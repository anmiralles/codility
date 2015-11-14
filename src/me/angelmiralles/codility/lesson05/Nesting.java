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
public class Nesting {
    
    private static int solution(String S){
        Stack<Character> pila = new Stack<>();
        int result=1;
        
        // Extraemos caracteres
        char charArray[]=S.toCharArray();
        
        // Si no hay num par elementos mal
        if((charArray.length%2)==0){
            
            // Recorremos array
            for(Character c:charArray){
                if(c.equals('('))
                    pila.push(c);
                else{
                    if(!pila.empty())
                        pila.pop();
                    else
                        return 0;
                }
            }
        } 
        
        return pila.isEmpty() ? 1 : 0;
    }
    
    public static void main(String args[]){
        String S="(()(())())";
        
        System.out.println("El resultado es: "+ solution(S));
    }
}
