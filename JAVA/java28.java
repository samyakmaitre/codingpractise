import java.util.*;

public class java28{
    public static void avg(float a, float b, float c){
        float average = (a+b+c)/3;
        System.out.println("Average is = " + average);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (1>0) {
            System.out.println("Enter three number: ");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            avg(a, b, c);
        }
        sc.close(sc);        
    }
}