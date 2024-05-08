public class binary{
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end)
        {
            int mid = (start+end)/2;

            //found
            if(arr[mid]==key){
                return mid;
            }

            //left
            if(key<arr[mid]){
                end=mid-1;
            }

            //right
            else{
                start=mid+1;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10, 12};
        System.out.println(binarySearch(array, 1));
    }
}