import java.util.*;

public class GFG2oct{
    public static void main(String args[])
    {
        //
    }

    public static int rotateDelete(ArrayList<Integer> arr){
        int n = arr.size();
        int sz = n;

        for(int k=1; k<=sz/2; k++){
            int lastElement = arr.remove(arr.size() - 1);
            arr.add(0, lastElement);

            int deleteIndex = n - k;
            arr.remove(deleteIndex);
            n--;
        }
        return arr.get(0);
    }
}