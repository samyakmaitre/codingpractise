import java.util.*;

public class BubbleSortAlgo{
    public static void main(String[] args){
        int[] arr = {5,1,1,4,2,3,3};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //print array
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}