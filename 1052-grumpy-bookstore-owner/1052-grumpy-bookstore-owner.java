class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int n) {
          int NotGrumpy=0;
          for(int i=0;i<grumpy.length;i++){
              if(grumpy[i]==0){
                NotGrumpy+=customers[i];
                customers[i]=0;
              }
          }
          int sum=0;
          for(int i=0;i<n;i++){
             sum+=customers[i];
          }
          int max=sum;
          int i=0;
          for(int j=n;j<customers.length;j++){
              sum-=customers[i];
              sum+=customers[j];
              i++;
              max=Math.max(max,sum);
          }
          return max+NotGrumpy;

    }
}