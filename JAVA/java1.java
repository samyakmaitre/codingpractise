import java.util.*;
public class java1 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter I number:");
        Double num1 = scn.nextDouble();
        System.out.println("Enter II number:");
        Double num2 = scn.nextDouble();
        System.out.println("Enter III number:");
        Double num3 = scn.nextDouble();
        double avg = (num1+num2+num3)/3;
        System.out.println("There average is: "+avg);

        scn.close();
    }
}
