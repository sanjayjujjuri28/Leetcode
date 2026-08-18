class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
          HashMap<String,Integer>map=new HashMap<>();
          for(int i=0;i<list1.length;i++){
              map.put(list1[i],i);
          }
          HashMap<String,Integer>ans=new HashMap<>();
          for(int i=0;i<list2.length;i++){
              if(map.containsKey(list2[i])){
                 ans.put(list2[i],map.get(list2[i])+i);
              }
          }
          int min=Integer.MAX_VALUE;
          int cnt=0;
          for(String str:ans.keySet()){
              if(ans.get(str)<min){
                 min=ans.get(str);
              }
          }
          List<String>ls=new ArrayList<>();
            for(String str:ans.keySet()){
              if(ans.get(str)==min){
                ls.add(str);
              }
          }
          String a[]=new String[ls.size()];
          int k=0;
          for(String i:ls){
             a[k++]=i;
          }
          return a;

    }
}