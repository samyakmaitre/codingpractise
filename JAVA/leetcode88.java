public class leetcode88 {
    public void merge(int[] nums1, int nums2[], int m, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0){
            if(j>=0 && nums1[i]<nums2[j]){
                nums1[k--]=nums2[j--];
            }else{
                nums1[k--]=num
            }
        }
    }
}
