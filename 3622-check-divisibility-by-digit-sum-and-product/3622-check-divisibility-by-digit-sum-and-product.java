class Solution {
    public boolean checkDivisibility(int n) {
          int sum=0;
          int prod=1;
          int k=n;
          while(n>0){
            int dig=n%10;
            sum+=dig;
            prod*=dig;
            n=n/10;
          }
          if(k%(sum+prod)==0){
            return true;
          }
          return false;
    }
}