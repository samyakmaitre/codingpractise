import java.util.*;

import org.w3c.dom.TypeInfo;

public class binToDec{

    // int to int
    public static void convert(int bin){

        int result = 0;
        int i = 0;
        while(bin>0){
            int ld = bin%10;
            result += (int)(ld*Math.pow(2,i));
            bin /= 10;
            i++;
        }

        System.out.println(result);
    }

    //String to int
    public static void convert2(String bin){
        int result = 0;
        int i = 0;
        int n = Integer.parseInt(bin);

        while(n>0){
            int ld = n%10;
            result += (ld*Math.pow(2,i));
            n /= 10;
            i++;
        }

        System.out.println(result);
    }

    //int to string
    public static void convert3(int bin){
        // int result = 0;
        // int i = 0;
        
        // while(bin > 0){
        //     int ld = bin%10;
        //     result += (ld*Math.pow(2,i));
        //     bin /= 10;
        //     i++;
        // }

        System.out.println(Integer.toString(bin,2));
    }

    //string to string
    public static void convert4(String s){
        int bin = Integer.parseInt(s,2);
        System.out.println(Integer.toString(bin) + 12);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        
        // int n = sc.nextInt();
        // convert(n);
        
        // String n = sc.next();
        // convert2(n);

        int n = sc.nextInt();
        convert3(n);

        // String x = sc.next();
        // convert4(x);

    }
}
