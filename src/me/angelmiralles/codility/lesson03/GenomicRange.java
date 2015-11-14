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
public class GenomicRange {
    
    public static int[] solution(String S, int[] P, int[] Q){
        int resultado[]=new int[P.length];
        
        for(int i=0;i<P.length;i++){
            int pos1=P[i];
            int pos2=Q[i];
            int j=0;
            int iDNA[]=new int[pos2-pos1+1];
            
            // Subcadena
            String sDNA=S.substring(pos1, pos2+1);
            
            // Extraemos caracteres
            char[] charArray = sDNA.toCharArray();
            
            // Buscamos factores 
            for(char c: charArray){
                switch(c){
                    case 'A':
                          iDNA[j]=1;
                          break;
                    case 'C': 
                          iDNA[j]=2;
                          break;
                    case 'G': 
                          iDNA[j]=3;
                          break;
                    case 'T': 
                          iDNA[j]=4;
                          break;
                };
                j++;
            }
            
            // Calculamos minimo factor
            resultado[i] = minFactor(iDNA);
            
        }
        
        return resultado;
    }
    
    private static int minFactor(int DNA[]){
        Arrays.sort(DNA);
        return DNA[0];
    }
    
    
    public static void main(String args[]){
        String S="CAGCCTA";
        int P[]=new int[]{2,5,0};
        int Q[]=new int[]{4,5,6};
        
        int resultado[] = solution(S, P, Q);
        
        System.out.println("El resultado es: "+ Arrays.toString(resultado));
    }
}
