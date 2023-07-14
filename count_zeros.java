import java.util.*; 

class Hello{
    public static void main(String[] args){
        
        //count numbr of zeros ; 
        System.out.print(count(3002010)); 
        
        
        
    }
    static int count(int n){
        return helper(n,0); 
       
    }
    static int helper(int n , int c){
        if(n == 0 ) return c ; 
        int rem = n%10 ; 

        
        if( rem == 0 ){
            return helper(n/10,c+1); 
        }
        return helper(n/10,c); 
        
    }
}
