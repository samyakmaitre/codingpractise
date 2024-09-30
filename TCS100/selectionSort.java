import java.util.*;

public class selectionSort {

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j = i+1; j< n; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr){
        for(int x : arr){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {4,25,2,22,11};

        selectionSort(arr);
        printArray(arr);
    }
        
}
