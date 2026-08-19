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
               l=Math.max(l,end+1);
            }
        
                map.put(ch,r);
                maxLen=Math.max(maxLen,r-l+1);
                r++;
        }
        return maxLen;
    }
}