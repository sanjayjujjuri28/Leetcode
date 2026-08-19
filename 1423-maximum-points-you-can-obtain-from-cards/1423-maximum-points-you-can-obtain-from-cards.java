class Solution {
    public int maxScore(int[] cp, int k) {
        int ans=0;
        int lsum=0,rsum=0;
        for(int i=0;i<k;i++){
            lsum+=cp[i];
        }
        ans=Math.max(ans,lsum);
        int i=k-1;
        int j=cp.length-1;
        while(i>=0){
            lsum=lsum-cp[i];
            rsum+=cp[j];
            ans=Math.max(ans,lsum+rsum);
            i--;
            j--;
        }
        return ans;

    }
}