import java.util.*;

public class countChars {
    public static void main(String[] args){
        while(true){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        x = x.toLowerCase();
        char[] arr = x.toCharArray();
        int vCounts = 0, cCounts = 0, sCounts = 0;
        for (char c : arr) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vCounts++;
                } else if (c == ' ') {
                    sCounts++;
                } else if (Character.isLetter(c)) {
                    cCounts++; // Only count consonants if it's a letter
                }
            }

        System.out.println(vCounts + " " + cCounts + " " + sCounts);
    }
}
}
