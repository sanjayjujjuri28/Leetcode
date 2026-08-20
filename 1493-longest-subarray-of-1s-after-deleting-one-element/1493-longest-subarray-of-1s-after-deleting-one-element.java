class Solution {
    public int longestSubarray(int[] nums) {
         int maxAns=0;
         int i=0,j=0,z=0;
         while(j<nums.length){
            if(nums[j]==0){
                z++;
            }
            if(z>1){
                while(z>1){
                    if(nums[i]==0){
                        z--;
                    }
                    i++;
                }
            }
            maxAns=Math.max(maxAns,j-i);
            j++;
         }
         return maxAns;
    }
}