public class butterfly {
    public static void butter(int n)
    {
            //1st half
        for(int i=1;i<=n; i++)
        {

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces 
            for(int j=1; j<=2*(n-1); j++){
                System.out.println(" ");
            }

            //stars
            for(int i=1; j<=i; j++){
                System.out.print("*");
            }
        }

        //2nd
        for(int i=n;i<=1; i--)
        {

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces 
            for(int j=1; j<=2*(n-1); j++){
                System.out.println(" ");
            }

            //stars
            for(int i=1; j<=i; j++){
                System.out.print("*");
            }
        }
    }

    public static void main(String[] args) {
        butter(4);
    }
}
