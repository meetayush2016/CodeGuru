package Arrays;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.*;

public class Blunder {
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("original array");
        pri(arr);

        //reverse all elements in array in row;

//        for(int i=0 ; i<arr.length ; i++){
//            for(int j=0 ; j<arr[i].length/2 ; j++){
//                int temp = arr[i][j];
//                arr[i][j] = arr[i][arr[i].length-j-1];
//                arr[i][arr[i].length-j-1] = temp;
//            }
//        }
//        System.out.println("printing reverse of evry row");
//        pri(arr);

        //reverse colums of a matrix;

//        for(int i=0 ; i<arr.length/2 ; i++){
//            int temp = arr[i][0];
//            arr[i][0] = arr[arr.length-1-i][0];
//            arr[arr.length-1-i][0] = temp;
//        }
//        System.out.println("1 st column reverse");
//        pri(arr);

//        for(int i=0 ; i<arr.length/2 ; i++){
//            for(int j=0 ; j<arr[i].length ; j++){
//                int temp = arr[i][j];
//                arr[i][j] = arr[arr.length-1-i][j];
//                arr[arr.length-1-i][j] = temp ;
//            }
//        }
//        System.out.println("Reversing all coulumns in array ");
//        pri(arr);


    }

    public static void pri(int[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j= 0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
    }
    public static void copy(int[][] original , int[][] nw){
        for(int i=0 ; i<original.length ; i++){
            for (int j=0 ; j<original[i].length ; j++){
                nw[i][j] = original[i][j];
            }
        }

    }

}
