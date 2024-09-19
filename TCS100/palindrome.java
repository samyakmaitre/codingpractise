import java.util.*;

public class palindrome{

    public static boolean checkPalindrome(int num){
        int dup = num;
        int rev = 0;

        while(num!=0){
            int ld = num % 10;
            rev = (rev * 10) + ld;

            num /= 10;
        }

        if(rev == dup){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int n = 10201;
        System.out.println(checkPalindrome(n));
    }
}