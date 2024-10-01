import java.util.*;

public class decToBin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String b = Integer.toBinaryString(x);

        System.out.println(b);
    }
}
