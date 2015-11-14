/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.angelmiralles.codility.lesson09;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author angelmiralles
 */
public class MatchAPattern {
    
    
    /**
     * Metodo para encontrar patron en cadena
     * @param p
     * @param m
     * @return posiciones donde encuentra patron
     */
    private static int[] findPattern(String p, String m){
        
        int plen=p.length();
        int mlen=m.length();
        int tamArray = mlen/plen;
        int i=0;
        
        int A[] = new int[tamArray];
        
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(m);
        
        while(i<tamArray && matcher.find()){
            A[i]=matcher.start();
            i++;
        }
        
        return A;
    }
    
    public static void main(String args[]){
        
        String p="\\d\\w";
        String m="ab4 56_7ab";
        
        System.out.println("El resultado es: "+Arrays.toString(findPattern(p, m)));
    }
}
