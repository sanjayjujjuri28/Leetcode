class Solution {
    public double findMaxAverage(int[] nums, int k) {
          double ans=Integer.MIN_VALUE;
          int sum=0;
          for(int i=0;i<k;i++){
            sum+=nums[i];
          }
          double avg=(double)sum/k;
          ans=Math.max(ans,avg);
          int i=0,j=k;
          while(j<nums.length){
              sum-=nums[i];
              sum+=nums[j];
              avg=(double)sum/k;
              ans=Math.max(ans,avg);
              i++;
              j++;
          }
          return ans;
    }
}