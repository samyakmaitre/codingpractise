import java.util.*;
import java.util.ArrayList;

public class largest2 {
    
    public static int largestnum(int n){
        String s = Integer.toString(n);
        int l = s.length();

        //add to array
        ArrayList<Integer> arr = new ArrayList<>();
        while(n>0){
            int ld = n%10;
            arr.add(ld);
            n=n/10;
        }

        //check pairs
        for(int i=0; i<l-1; i++){
            for(int j = 0; j<l-1; j++){
                if(arr.get(j)>arr.get(j+1)){
                    if(arr.get(j)%2 == arr.get(j+1)%2){
                        //swap
                        int temp = arr.get(j);
                        arr.set(j, arr.get(j+1));
                        arr.set(j+1, temp);
                    }
                }
            }
        }

        int result = 0;
        for(int i=l-1; i>=0; i--){
            result = result * 10 + arr.get(i);
        }

        return result;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        System.out.println(largestnum(n));

    }
}
