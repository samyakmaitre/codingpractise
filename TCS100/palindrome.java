import java.util.*;

public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int number = sc.nextInt();

        if(palindromeCheck(number)){
            System.out.println("is Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

        sc.close();
    }

    private static boolean palindromeCheck(int num){
        int original = num;
        int reversed = 0;

        while(num!=0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}