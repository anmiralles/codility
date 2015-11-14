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
public class FrogJump {
    
    
    private static int solution(int X, int Y, int D){
        
        int saltos=0, distancia=0;
        
        do{
            ++saltos;
            distancia=X+saltos*D;
        } while(distancia<Y);
        
        return saltos;
    }
    
    
    public static void main(String args[]){
        
        int X=10, Y=85, D=30;
        
        System.out.println("El resultado es: " + solution(X,Y,D));
    }
}
