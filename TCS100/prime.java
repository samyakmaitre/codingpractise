import java.util.*;

public class prime {

    public static boolean isPrime(int n)
    {   
        if(n==0 || n==1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }    

    public static void main(String[] args){
        while(true){
            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            System.out.println(isPrime(x));
        }
    }
}
