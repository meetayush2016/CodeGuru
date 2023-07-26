import java.util.*; 


class Hello{
    public static void main(String[] args){
        System.out.println(odd(3)); 
        
    }
    static boolean odd(int n){
        return ((n&1)==1);
    }
}
