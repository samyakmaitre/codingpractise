import java.util.*;

public class main{
    public static void main(String[] args){
        int[] arr = {42,55,667,87,90,12,44,33,45};
        int min = Integer.MAX_VALUE ;
        for(int x : arr){
            if( x < min){
                min = x;
            }
        }
        System.out.println(min);
    }
}