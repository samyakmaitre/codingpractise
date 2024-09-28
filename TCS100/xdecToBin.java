import java.util.*;

public class xdecToBin{
    // public static void main(String[] args){
    //     int n = 17;
    //     System.out.println(Integer.toBinaryString(n) + 1);
    // }

    public static void main(String[] args){
        int dec = 4;

        int bin = 0;
        int place = 1;

        while(dec>0){

            int rem = dec % 2;
            dec /= 2;
            bin += rem * place;
            place *= 10;
        }
        System.out.println(bin);
    }
}