import java.util.*;

public class quickSort2{

    public static void quickSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }

        int pIdx = partition( arr, si, ei);
        quickSort( arr,  si,  pIdx-1);
        quickSort( arr,  pIdx,  ei);
    }

    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si - 1;
        for(int j=si; j<ei; j++){
            if(arr[j]<= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }

}