import java.util.*;

public class binToOct{

    public static int binarytoOctal(int binary){
        int decimal = 0, i = 0, remainder;
        //bin to decimal
        while(binary!=0){
            remainder = binary%10;
            decimal += remainder * Math.pow(2,i);
            binary = binary/10;
            i++;
        }
        //decimal to oct
        int octal = 0;
        i = 1;
        while(decimal!=0){
            remainder = decimal %8;
            octal += remainder * i;
            decimal = decimal /8;
            i = i*10;
        }

        return octal;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int bin = sc.nextInt();
        int oct = binarytoOctal(bin);
        System.out.println(oct);
    }
}