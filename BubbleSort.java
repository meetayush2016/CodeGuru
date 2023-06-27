// BUBBLE SORTING 
import java.util.*;
class Helo{
    static void Bubble(int[] arr){
        boolean swaped;
        for(int i=0;i<arr.length;i++){
            swaped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swaping
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] a = {22,5,1,6,7,3,1}; 
        Bubble(a);
        System.out.print(Arrays.toString(a));
        
    }
}
