import java.util.*;

public class secondSmallest_Largest{
    public static void main(String[] args){
        int[] arr = {12,35,1,10,34,1};
        findSecondSmallestLargest(arr);
    }

    public static void findSecondSmallestLargest(int[] arr){
        if(arr.length < 2){
            System.out.println("Invalid");
            return;
        }

        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for(int i =0; i< arr.length; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }

            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        if(secondSmallest == Integer.MAX_VALUE || secondLargest == Integer.MIN_VALUE){
            System.out.println("Not found");
        }else{
            System.out.println(secondLargest);
            System.out.println(secondSmallest);
        }
    }
}