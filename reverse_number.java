import java.util.*; 
class Hello{
    public static void main(String[] args){
        
        fun(1234); 
        System.out.print(sum); 
        
    }
    static int sum = 0;
    static void fun(int a){
        if( a == 0 ) return ; 
        
        int rem = a%10; 
        sum = sum*10 + rem ; 
        fun(a/10); 
         
    }
}
