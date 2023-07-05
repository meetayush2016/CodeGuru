// You are using Java
 import java.util.*;
 
 class Patters{
     public static void main(String[] args){
         int n = 5;
    
        for(int row=0; row<=n ;row++){
            for(int col = 1 ; col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
     }
 }

// OUTPUT 
//  *
//  * *
//  * * *
//  * * * *
//  * * * * *

// You are using Java
 import java.util.*;
 
 class Patters{
     public static void main(String[] args){
         int n = 5;
    
        for(int row=n; row>0 ;row--){
            for(int col = 1 ; col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
     }
 }

// OUTPUT

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
