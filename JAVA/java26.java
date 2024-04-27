// import java.util.*;

// public class java26 {
//     public static boolean isPrime(int n) {
//         if (n <= 1) {
//             return false;
//         }
//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//     }
        
//     return true;
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if(isPrime(a)){
//             System.out.println("its prime");
//         }
//         else{
//             System.out.println("not prime");
//         }
//     }
// }


// import java.util.*;

// public class java26{
//     public static boolean isprime(int n){
//         boolean isprime = true;
//         for (int i=2;i<n;i++){
//             if(n%i==0){
//                 isprime = false;
//                 break;
//             }
//         }
//         return isprime;
//     }

//     public static void main(String args[]){
//         while (1<3){
//         System.out.println("Enter any positive integer: ");
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         if( x==0 ||  x==1){
//             System.out.println("neither prime nor composite");
//         }
//         else{
//             System.out.println(isprime(x));
//         }
//         }
//     }
// }

import java.util.*;

public class java26
{
    public static boolean isprime(int n)
    {
        boolean isprime = true;
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0){
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    
    public static void bintodec(int n){
        
    }

    public static void main(String args[]){
        System.out.println(bintodec(6));
    }
}