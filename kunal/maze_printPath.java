// print different path on a maze 

import java.util.*; 

class Hello{
    public static void main(String[] args){
        // System.out.print("Hello");
        
        path("",3,3);
    }
    static void path(String s , int r , int c){
        if(r==1 && c==1){
            System.out.println(s); 
            return ; 
        } 
        
        if(r>1){
            path(s + 'D' , r-1,c);
        }
        if(c>1){
             path(s + 'R' , r,c-1);
        }
    }
}
