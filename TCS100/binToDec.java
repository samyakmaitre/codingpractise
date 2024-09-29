import java.util.*;

public class binToDec{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String bin = sc.nextLine();
        int dec = Integer.parseInt(bin, 2);
        System.out.println(dec);
        sc.close();
    }
}