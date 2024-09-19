import java.util.*;

public class binToDec {

    public static double convert(int n){
        double result = 0;
        int count  = 0;

        while(n!=0){
            double ld = n % 10;
            result = result + ld * Math.pow(2,count);
            count++;
            n /= 10;
        }

        return result;
    }
    public static void main(String[] args){
        int num = 1011;
        System.out.println((int)convert(num));
    }
}
