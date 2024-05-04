public class binary {
    public static int binarysearch(int arr[],int key){
        int start = 0;
        int end = arr.length;

        while(start<=end){

            int mid = (start+end)/2;

            //found case
            if(arr[mid]==key){
                return mid;
            }

            
        }
    }

    public static void main(String[] args) {
        
    }
}
