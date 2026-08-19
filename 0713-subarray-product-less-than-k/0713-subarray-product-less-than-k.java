class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        int cnt=0;
        long prod=1;
        if(k<=1){
            return 0;
        }
        for(int j=0;j<nums.length;j++){
            prod=prod*nums[j];
            while(prod>=k){
                prod=prod/nums[i];
                i++;
            }
            cnt+=(j-i+1);
        }
        return cnt;
    }
}