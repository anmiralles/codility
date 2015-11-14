/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.angelmiralles.codility.challenge;

/**
 *
 * @author angelmiralles
 */
public class Challenge1 {
    
    /**
     * Inner class to simulate HashMap with same key values
     */
    public static class MultiMap{
       
        private String s;
        private Integer i;

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }

        public Integer getI() {
            return i;
        }

        public void setI(Integer i) {
            this.i = i;
        }
        
        public void setValues(String number, Integer cost) {
            this.s=number;
            this.i=cost;
        }
    }
    
    public static int solution(String S) {
        // Local variables
        int res=0,i=0,maxDuration=0;
        String numberMaxCall="";
        
        // Split in lines
        String [] Line = S.split("\n");
        
        MultiMap[] H = new MultiMap[Line.length];
        
        // Eache line is a log
        for(String Log:Line){
            String [] Call = Log.split(",");
            
            // Duration and number
            String Duration=Call[0];
            String Number = Call[1];
            
            String[]HMS=Duration.split(":");
            
            int hour = Integer.parseInt(HMS[0]);
            int min = Integer.parseInt(HMS[1]);
            int sec = Integer.parseInt(HMS[2]);
            
            int duration = hour*360+min*60+sec;
            
            // Create a hashmap 
            H[i]=new MultiMap();
            H[i].setValues(Number, duration);
            i++;
        }
        
        // Dterminamos telefono con maxima duracion
        for(MultiMap p:H){
            if(p.getI()>maxDuration)
                numberMaxCall=p.getS();
        }
        
        // Call the total cost
        for(String Log:Line){
            String [] Call = Log.split(",");
            
            String Duration=Call[0];
            String Number = Call[1];
            
            Number=Number.trim();
            String[]HMS=Duration.split(":");
            
            int hour = Integer.parseInt(HMS[0]);
            int min = Integer.parseInt(HMS[1]);
            int sec = Integer.parseInt(HMS[2]);
        
            if(!Number.equals(numberMaxCall))
                res=res+calCost(min, sec);
        }
        
        return res;
        
    }
    
    /**
     * 
     * @param min
     * @param sec
     * @return 
     */
    public static int calCost(int min, int sec){
        int cost=0;
        
        if(min<5)
                cost=cost+(((min*60)+sec)*3);
            else{
                if(sec>0)
                    min=min+1;
                
                cost=cost+(min*150);
            }
        
        return cost;
    }
    
    
    
    public static void main(String args[]){
        String S="00:01:07,400-234-090\n00:05:01,701-080-080\n00:05:00,400-234-090";
        System.out.println(solution(S));
    }
}
