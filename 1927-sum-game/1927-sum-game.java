class Solution {
    public boolean sumGame(String num) {
        int diff=0;
        int leftQ=0;
        int rightQ=0;
        for(int i=0;i<num.length()/2;i++){
            char ch=num.charAt(i);
            if(ch!='?'){
                diff+=(ch-'0');
            }
            else{
              leftQ++;
            }
        }
         for(int i=num.length()/2;i<num.length();i++){
            char ch=num.charAt(i);
            if(ch!='?'){
                diff-=(ch-'0');
            }
            else{
              rightQ++;
            }
        }
       if (leftQ == rightQ) {
         return diff != 0;
        }
         if (leftQ > rightQ) {
            return diff + (leftQ - rightQ) * 9 / 2.0 != 0;
        } else {
            return diff - (rightQ - leftQ) * 9 / 2.0 != 0;
        }

    }
}