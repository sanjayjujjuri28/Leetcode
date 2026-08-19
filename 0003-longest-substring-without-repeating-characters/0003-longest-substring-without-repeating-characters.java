class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int l=0;
        int r=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
               int end=map.get(ch);
               while(l<=end){
                  map.remove(s.charAt(l));
                  l++;
               }
               map.put(ch,r);
            }
            else{
                map.put(ch,r);
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}