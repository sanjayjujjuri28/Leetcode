class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        for(int i=0;i<k;i++){
           sb.append(str.charAt(i));
        }
        int no = Integer.parseInt(sb.toString());
        if(no!=0 && num%no==0){
           cnt++;
        }
        int i=0;
        for(int j=k;j<str.length();j++){
          sb.deleteCharAt(0);
          sb.append(str.charAt(j));
          i++;
          no = Integer.parseInt(sb.toString());
          if(no!=0 && num%no==0){
           cnt++;
           }
        }
        return cnt;
    }
}