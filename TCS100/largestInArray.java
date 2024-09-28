import java.util.*;

public class largestInArray {

    public static void largest(int[] arr){

        int max = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args){
        int arr1[] = {2,5,1,13,0};
        int arr2[] = {8,10,5,7,9};
        largest(arr1);
        largest(arr2);
    }
}
