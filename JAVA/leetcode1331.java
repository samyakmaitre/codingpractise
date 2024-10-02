import java.util.*;

public class leetcode1331{

    public static int[] rank(int[] arr){
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        
        for(int x : sortedArr){
            if(!map.containsKey(x)){
                map.put(x, rank);
                rank++;
            }
        }
        int[] rankArr = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            rankArr[i] = map.get(arr[i]);
        }

        return rankArr;
    }

    public static void main(String args[]){
        int[] arr = {37,12,28,9,100,56,80,5,12};

        int[] result = rank(arr);

        for(int x : result){
            System.out.print(x + " ");
        }
    }
}