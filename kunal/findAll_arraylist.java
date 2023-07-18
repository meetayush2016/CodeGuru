import java.util.*; 
class Hello{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,5};
        int t = 4;
         
        System.out.print(findAll(arr , t, 0));
        
        
       
       
    } 
    static ArrayList<Integer> findAll(int[] arr , int t , int i ){
        ArrayList<Integer> list = new ArrayList<>(); 
        if(i==arr.length) return list ; 
        
        if(arr[i] == t ){
            list.add(i); 
        }
        ArrayList<Integer> ansBelow = findAll(arr , t, i+1 );
        list.addAll(ansBelow);
        return list; 
            
        
    }
}
