// public class bubblesort {
//     public static void bs(int arr[]){
//         for(int turn=0; turn<arr.length-1;turn++)
//         {
//             for(int j=0;j<arr.length-1-turn;j++)
//             {
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j+1];
//                     arr[j+1]=arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//         for(int r=0; r<arr.length ; r++){
//             System.out.print(arr[r]+" ");
//         }
//     }

//     public static void main(String args[]){
//         int myarr[] = {5,1,3,2,4};
//         bs(myarr);
//     }
// }


public class bubblesort{
    public static void bblsort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn;j++ ){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int my_arr[] = {5,1,3,2,4};
        bblsort(my_arr);
    }
}