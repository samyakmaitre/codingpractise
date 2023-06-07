package Java;
import java.util.*;
public class evenodd{
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");           
        }
        sc.close();;
    }
}