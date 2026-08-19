class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen=0;
        int i=0,j=0;
        int z=0;
        while(j<nums.length){
            if(nums[j]==0){
                z++;
            }
            if(z>k){
              if(nums[i]==0){
                z--;
              }
               i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}