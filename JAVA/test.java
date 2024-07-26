import java.util.Scanner;

public class test {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operator: ");
        char c = sc.next().charAt(0);

        int result;

        switch(c){
            case '+': System.out.println(a+b);
            case '-': System.out.println(a-b);
            case '*': System.out.println(a*b);
            case '/': System.out.println(a-b);
        }
    }
}
