

public class countingsort {
    
    public static void cs(int arr[]){

        //largest from array
        int largest = Integer.MIN_VALUE;
        for (int i = 0 ; i<arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }

        //new array with largest as size
        int[] frq = new int[largest+1];
        
        //add frequency
        for(int j = 0; j<arr.length; j++){
            frq[arr[j]]++;
        }

        //sorting
        int k = 0;
        for (int i = 0; i<frq.length;i++){
            while(frq[i]>0){
                arr[k]=i;
                k++;
                frq[i]--;
            }
        }
    }
}
