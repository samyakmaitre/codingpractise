public class binary{
    public static void binarysearch(int[] arr, int key){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end -start)/2 ;

            if(arr[mid]==key) {
                System.out.println("key found at: " + mid) 
                return
            }

            if(arr[mid]<key){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }
        }

        System.out.println("key not found");
    }

    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12};
        binarysearch(array, 11);
    }
}