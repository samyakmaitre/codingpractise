public class MinimalCost {
    
    public static void main(String[] args){

    }

    public int minCost(int k, int[] arr){
        int n = arr.length;
        int[] dp = arr.length;
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 1; i<n; i++){
            for(int j =1; j<= k && i -  j >=0; j++){
                dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(arr[i] - arr[i-j]));
            }
        }
        return dp[n-1];
    }


}
