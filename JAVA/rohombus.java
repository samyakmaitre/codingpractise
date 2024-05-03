public class rohombus{
    public static void print(int h, int w){
        for (int r=1; r<=h; r++){
            //space
            for(int i=0;i<=r;i++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<w; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(4, 5);
    }
}