class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ls=new ArrayList<>();
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        if(p.length()>s.length()){
            return ls;
        }
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        int k=p.length();
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        if(map2.equals(map1)){
            ls.add(0);
        }
        int i=0;
        for(int j=k;j<s.length();j++){
            char ch=s.charAt(i);
            map2.put(ch,map2.get(ch)-1);
            if(map2.get(ch)==0){
                map2.remove(ch);
            }
            i++;
            map2.put(s.charAt(j),map2.getOrDefault(s.charAt(j),0)+1);
            if(map2.equals(map1)){
                ls.add(i);
            }
        }
        return ls;
    }
}