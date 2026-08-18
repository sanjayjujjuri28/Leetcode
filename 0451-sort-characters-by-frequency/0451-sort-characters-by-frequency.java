class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        String ans="";
        while(!map.isEmpty()){
            char key=0;
            int val=0;
            for(char ch:map.keySet()){
                if(map.get(ch)>val){
                    key=ch;
                    val=map.get(ch);
                }
            }
            for(int i=0;i<val;i++){
                ans+=key;
            }
            map.remove(key);
        }
        return ans;
    }
}