public class binomial{
    public static void main(String[] args){
        System.out.println(fact(5,1));
    }

    public static float fact(int n, int r){
        int fact = 1, rfact = 1, sfact = 1;

        for(int i=1; i<=n ; i++){
            fact *= i;
        }
        
        return fact;
    }


    public static float fact(int n, int r){
        int nfact = 1, rfact = 1, sfact = 1;

        for(int i=1; i<=n ; i++){
            nfact *= i;
        }
        for(int i=1; i<=r ; i++){
            rfact *= i;
        }
        for(int i=1; i<=(n-r) ; i++){
            sfact *= i;
        }

        float prod = nfact/(rfact*sfact);

        return prod;
    }
}