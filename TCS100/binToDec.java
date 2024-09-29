import java.util.*;

public class binToDec{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int bin = sc.nextInt();

        int dec = 0;
        int p = 0;

        // bin to dec
        while(bin > 0){
            int ld = bin % 10;
            dec += ld * Math.pow(2,p);
            bin /= 10;
            p++;
        }
        System.out.println("Decimal equi: " + dec);

        sc.close();
    }
}