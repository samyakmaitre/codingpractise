import java.util.*;

public class binToOctal {
    public static void main(String[] args){
        while(true){
            Scanner sc = new Scanner(System.in);
            String bin = sc.nextLine();
            int dec = Integer.parseInt(bin, 2);
            System.out.println(dec);
            String oct = Integer.toOctalString(dec);
            System.out.println(oct);
        }
    }
}
