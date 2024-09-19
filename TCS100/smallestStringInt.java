import java.util.*;

public class smallestStringInt{
    public static int smallest(String[] arr){
        int min = Integer.MAX_VALUE;
        for(String x : arr){
            
        }
        return min;
    }
    
    public static void main(String[] args){
        String[] arr = {"56", "43", "78", "3", "32", "91", "66"};
        int min = Integer.MAX_VALUE;
        for(String x : arr){
            int curr = Integer.parseInt(x);
            if(curr<min){
                min = curr;
            }
        }
        System.out.println(min);
    }
}