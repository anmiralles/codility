/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.angelmiralles.codility.util;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author angelmiralles
 */
public class Util {
    
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
     * Metodo para calcular minimo entero de un array
     * @param A
     * @return 
     */
    private static int calMinArray(int A[]){
        int res=Integer.MAX_VALUE;
        for(Integer i:A){
            if(i<res)
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
        int res[][]= new int[pos][A.length-pos];
        
        // Conformamos split
        System.arraycopy(A, 0, res[0], 0, pos);
        System.arraycopy(A, pos, res[1], pos, A.length - pos);
        
        return res;
    }
    
    
    /**
     * Metodo que suma elementos de un array
     * @param A
     * @return 
     */
    private static int sumElements(int A[]){
        int res=0;
        
        for(Integer i:A){
            res=res+i;
        }       
        
        return res;
    }
    
    
    /**
     * Metodo para contar ocurrencias de un elemento
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
    
    
    /**
     * Metodo para encontrar patron en cadena
     * @param p
     * @param m
     * @return posiciones donde encuentra patron
     */
    private static int[] findPatternsInString(String p, String m){
        
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
    
    
    /**
     * Metodo para convertir binario a decimal
     * @param binary
     * @return 
     */
    private static int decimalConversion(String binary){
        int dec=Integer.parseInt(binary,2);
        return dec;
    }
    
    
    /**
     * Metodo para convertir a binario
     * @param dec
     * @return 
     */
    private static String binaryConversion(int dec){
        String binary=Integer.toBinaryString(dec);
        return binary;
    }
    
    
    /**
     * Metodo verificador par
     * @param num
     * @return 
     */
    private static boolean isEven(int num){
        if(num%2==0)
            return true;
        else
            return false;
    }
    
    
    /**
     * Metodo verificado impar
     * @param num
     * @return 
     */
    private static boolean isOdd(int num){
        if(num%2!=0)
            return true;
        else
            return false;
    }
    
    
    
    
    public static void main(String args[]){
        System.out.println("Funciona!");
    }
    
    
}
