class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i<ans.length;i++){
            ans[i] = ans[i>>1] + (i&1);
        //     int temp = i;
        //     int count = 0;
        //     while(temp!=0){
        //         temp = temp & (temp-1);
        //         count++;
        //     }
        //     ans[i]=count;

        }
        return ans;
    }
}
