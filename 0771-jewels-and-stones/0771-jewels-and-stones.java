class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            set.add(ch);
        }
        int cnt=0;
        for(int i=0;i<stones.length();i++){
            if(set.contains(stones.charAt(i))){
                cnt++;
            }
        }
        return cnt;
    }
}