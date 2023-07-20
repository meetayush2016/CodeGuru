// count nmber of paths in a maze 

import java.util.*; 

class Hello{
    public static void main(String[] args){
        // System.out.print("Hello");
        
        System.out.print(count(3,3));
    }
    static int count(int r , int c){
        if(r==1 || c==1) return 1; 
        
        int right = count ( r-1, c); 
        int left = count( r , c-1); 
        
        return left + right; 
    }
}
