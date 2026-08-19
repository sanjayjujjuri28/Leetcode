class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer>map=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
         }
        Integer arr[]=new Integer[map.size()];
        int j=0;
        for(int x:map.keySet()){
           arr[j++]=x;
        }
        Arrays.sort(arr, (a, b) -> map.get(b) - map.get(a));
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=arr[i];
        }
       return ans;
    }
}