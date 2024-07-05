public class awesomeSort {
    int[] arr = {5,10,30,7};
    customSort(arr);

    for(int num : arr){
        System.out.println(num +" ");
    }
}


public static void customSort(int[] arr){
    ArrayList<Integer> evenDivBy5 = new ArrayList<>();
    ArrayList<Integer> evenNotDivBy5 = new ArrayList<>();
    ArrayList<Integer> oddNumbers = new ArrayList<>();
    ArrayList<Integer> evenIndices = new ArrayList<>();

    for(int i = 0; i<arr.length; i++){
        if(arr[i]%2==0){
            if(arr[i]%5==0){
                evenDivBy5.add(arr[i]);
            }
            else{evenNotDivBy5.add}
        }
    }
}