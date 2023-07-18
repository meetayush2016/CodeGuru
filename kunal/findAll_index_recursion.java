import java.util.*; 
class Hello{
    public static void main(String[] args){
       int[] arr = {1,2,3,3,4}; 
       int target = 3 ; 
       findAll(arr,   target , 0 ); 
       System.out.print(list); 
       
    }
    static ArrayList<Integer> list  = new ArrayList<>(); 
    static void findAll(int[] arr , int target , int index){
        if(index == arr.length) return ; 
        
        if(arr[index] == target){
            list.add(index); 
        }
        findAll(arr,target,index+1);
    }
    
    
}
