import java.util.*;

public class smallestInArray{
    public static int smallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int x : arr){
            if( x<min ){
                min = x;
            }
        }
        return min;
    }
    
    public static void main(String[] args){
        int[] arr = {8,10,5,7,9};
        System.out.println(smallest(arr));
    }
}