class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        //if(nums)
       
        for(int i=0;i<nums.length;i++){
            if (nums[i] > 0) {
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }else{
                    List<Integer> triplet = new ArrayList<Integer>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    ans.add(triplet);
                    int lastJOccurrence = nums[j];
                    int lastKOccurrence = nums[k];
                    while (j < k && nums[j] == lastJOccurrence) {
                        j++;
                    }
                    
                    while (j < k && nums[k] == lastKOccurrence) {
                        k--;
                    }
                }
            }
        }
        return ans;
    }
    
}
