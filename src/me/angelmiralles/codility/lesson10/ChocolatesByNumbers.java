/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.angelmiralles.codility.lesson10;

/**
 * Created by yaodh on 2014/12/8.
 * https://codility.com/demo/results/demoKHXQ7Q-TZ6/
 * 1. ChocolatesByNumbers
 * There are N chocolates in a circle. Count the number of chocolates you will eat.
 * Task description
 * Two positive integers N and M are given. Integer N represents the number of chocolates arranged in a circle,
 * numbered from 0 to N − 1.
 * You start to eat the chocolates. After eating a chocolate you leave only a wrapper.
 * You begin with eating chocolate number 0. Then you omit the next M − 1 chocolates or wrappers on the circle,
 * and eat the following one.
 * More precisely, if you ate chocolate number X,
 * then you will next eat the chocolate with number (X + M) modulo N (remainder of division).
 * You stop eating when you encounter an empty wrapper.
 * For example, given integers N = 10 and M = 4. You will eat the following chocolates: 0, 4, 8, 2, 6.
 * The goal is to count the number of chocolates that you will eat, following the above rules.
 * Write a function:
 * class Solution { public int solution(int N, int M); }
 * that, given two positive integers N and M, returns the number of chocolates that you will eat.
 * For example, given integers N = 10 and M = 4. the function should return 5, as explained above.
 * Assume that:
 * N and M are integers within the range [1..1,000,000,000].
 * Complexity:
 * expected worst-case time complexity is O(log(N+M));
 * expected worst-case space complexity is O(1).
 */

/**
 *
 * @author angelmiralles
 */
public class ChocolatesByNumbers {
    
    private static int solution(int N, int M){
        int res=1;
        int X=0;
        
        while((X+M)%N!=0){
            X=X+M;
            res++;
        }
        
        return res;
    }
    
    public static void main(String args[]){
        int N=10;
        int M=4;
        
        System.out.println("El resultados es: "+solution(N, M));
    }
}
