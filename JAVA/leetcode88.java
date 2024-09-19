public class leetcode88{
    static class Solution{
        public static void merge(int[] nums1, int[] nums2, int m, int n){
            int i = m-1;
            int j = n-1; 
            int k = m+n-1;

            while(j>=0){
                if(i>=0 && nums1[i] > nums2[j]){
                    nums1[k--] = nums1[i--];
                }
                else{
                    nums1[k--] = nums2[j--];
                }
            }
        }
        public static void main(String[] args){

        }
    }
}