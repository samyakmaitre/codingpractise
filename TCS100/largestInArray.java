import java.util.*;

public class largestInArray{
    public static void main(String[] args){
        int[] arr = {12,43,54,66,8,34,5};
        int max = arr[0];
        for(int x : arr){
            if(x>max){
                max = x;
            }
        }
        System.out.println(max);
    }
}