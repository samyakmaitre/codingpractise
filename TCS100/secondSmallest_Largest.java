import java.util.*;

public class secondSmallest_Largest {

    public static void elements(int[] arr){
        
        if(arr.length < 2){
            System.out.println(-1);
            System.out.println(" ");
            System.out.println(-1);
            System.out.println("\n");
        }

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        for(int i = 0 ; i< arr.length; i++){
            if(arr[i]<min && arr[i] != min){
                min2 = arr[i];
            }
            if(arr[i]>max && arr[i] != max){
                max2 = arr[i];
            }
        }
        System.out.println(min2);
        System.out.println(max2);
    }
    

    public static void main(String[] args){
        int[] arr1 = {1,2,4,7,7,5};
        elements(arr1);
    }
}
