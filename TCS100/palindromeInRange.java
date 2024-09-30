import java.util.*;

public class palindromeInRange {
    //ispalindrome
    public static boolean isPalindrome(int x){
        int rev = 0;
        int ori = x;
        while(x>0){
            int ld = x%10;
            rev = rev*10 + ld;
            x = x/10;
        }

        return rev==ori;
    }
    //main function
    public static void main(String[] args){
        int min = 10;
        int max = 50;

        for(int i=min; i<=max; i++){
            if(isPalindrome(i)){
                System.out.print(i + " ");
            }
        }
    }
}
