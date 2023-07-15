import java.util.*; 

class Hello{
    public static void main(String[] args){
        System.out.println("Hello world ");
        subSequence("","ayush"); 
    }
    
    static void subSequence(String p , String up){
        if(up.isEmpty()){
            System.out.println(p); 
            return;
        }
        
        char ch = up.charAt(0); 
        subSequence(p+ch, up.substring(1)); 
        subSequence(p , up.substring(1)); 
        
    }
}
