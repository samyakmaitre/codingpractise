public class arraycc {

    public static int check(String arr[],String x){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        String myarr[] = {"apple","orange","banana","grapes"};
        System.out.println(check(myarr, "banana"));
    }
}
