// BUBBLE SORTING 
import java.util.*;
class Helo{
    static void selection(int[] arr){
        for(int i=0; i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
        
    }
    private static int getMaxIndex(int[] arr, int start, int last){
        int max = start; 
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args){
        int[] a = {5,1,2,7,0,10};
        selection(a);
        System.out.print(Arrays.toString(a));
        
        
        
    }
}
