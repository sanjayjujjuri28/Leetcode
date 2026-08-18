class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i:hm.keySet()){
            if(set.contains(hm.get(i))){
                return false;
            }
            set.add(hm.get(i));
        }
        return true;
    }
}