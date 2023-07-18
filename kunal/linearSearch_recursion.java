import java.util.*; 
class Hello{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int t = 3;  
        System.out.println(find(arr,t,0));
        System.out.println(findIndex(arr, t, 0));
        
    }
    static boolean find(int[] arr , int t , int i ){
        if(i == arr.length) return false; 
        return arr[i] == t || find(arr, t , i+1); 
    }
    
    static int findIndex(int[] arr , int t , int i ){
        if(i == arr.length)  return -1; 
        if(arr[i] == t){
            return i; 
        }else{
            return findIndex(arr , t , i+1);
        }
    }
}
