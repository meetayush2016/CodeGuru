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


        //new copy array
        int[][] newArr = new int[arr.length][arr[0].length];
        copy(arr , newArr);
        System.out.println("new copy of above array by making a new array ");
        pri(newArr);

        //transpose of a matrix
        int[][] trans = new int[arr.length][arr.length];

        for(int i=0 ;i<arr.length ; i++){
            for(int j=0 ; j< arr[i].length;j++){
                trans[i][j] = arr[j][i];
            }
        }

        System.out.println("transpose of this matrix is");
        pri(trans);



        //now we will reverse singl row of the matrix
        for(int i=0 ; i<arr[0].length/2 ; i++){
            int temp = arr[0][i];
            arr[0][i] = arr[0][arr[0].length-1-i];
            arr[0][arr[0].length-1-i] = temp ;


        }
        System.out.println("after reversing 1 st row  ");
        pri(arr);

        for(int i=0 ; i<arr[1].length/2 ; i++){
            int temp = arr[1][i];
            arr[1][i] = arr[1][arr[1].length-1-i];
            arr[1][arr[1].length-1-i] = temp ;


        }
        System.out.println("after reversing 1 and 2 st row  ");
        pri(arr);

        for(int i=0 ; i<arr[2].length/2 ; i++){
            int temp = arr[2][i];
            arr[2][i] = arr[2][arr[2].length-1-i];
            arr[2][arr[2].length-1-i] = temp ;

        }
        System.out.println("reversing 1 , 2 and 3 also ");
        pri(arr);





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
