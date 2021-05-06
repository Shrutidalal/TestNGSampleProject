package TestPckage;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
    public static void rotateArrayTest(int[] arr, int d){
        List<Integer> temp = new ArrayList<>();
        for(int x =0;x<d;x++){
            temp.add(arr[x]);
            //arr[x-d] = arr[x];

        }
        for(int x = 0;x<arr.length-d;x++){
            arr[x] = arr[x+d];
        }

        for(int x : temp){
            System.out.println("Printing New temp array");
            System.out.println(x);
        }
        for(int x : arr){
            System.out.println("Printing Original array");
            System.out.println(x);
        }

    }

    public static void main(String[] arg){
        int[] newArray = {1,2,3,4,5,6,7,8};
        rotateArrayTest(newArray,3);
    }
}
