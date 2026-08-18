class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String>map=new HashMap<>();
        for(List<String>ls:paths){
            map.put(ls.get(0),ls.get(1));
        }
        for(List<String>ls:paths){
            if(!map.containsKey(ls.get(0))){
                return ls.get(0);
            }
            if(!map.containsKey(ls.get(1))){
                return ls.get(1);
            }
        }
        return " ";
    }
}