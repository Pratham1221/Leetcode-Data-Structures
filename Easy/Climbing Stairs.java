class Solution {

    public int helper(int n,int[] dp){
        //  if(n==0){
        //     return dp[n] = 0;
        // }
        if(n==1){
            return  1;
        }
        if(n==2){
            return 2;
        }
      

        if(dp[n] != -1){
            return dp[n];
        }

         return dp[n] =  helper(n-1,dp) + helper(n-2,dp);

    }
    public int climbStairs(int n) {
       
        // if(n<=2){
        //     return n;
        // }
        // int[] a = new int[n+1];
        // a[0] = 0;
        // a[1] = 1;
        // a[2] = 2;
        // for(int i = 3;i<a.length;i++){
        //     a[i] = a[i-1] + a[i-2];
        // }
        // return a[n];

        int[] dp = new int[46];

        for(int i=3;i<=45;i++){
            dp[i] = -1;
        }



        return helper(n,dp);
    }
}
