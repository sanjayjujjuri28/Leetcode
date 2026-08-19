class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
         HashMap<Integer,HashSet<Integer>>map=new HashMap<>();
         for(int[] x:reservedSeats){
              int row=x[0];
              int col=x[1];
              map.putIfAbsent(row,new HashSet<>());
              map.get(row).add(col);
         }
         long ans=(long)(n-map.size())*2;
         for(HashSet<Integer>hm:map.values()){
              boolean left=true;
              boolean middle=true;
              boolean right=true;
              for(int i=2;i<=5;i++){
                 if(hm.contains(i)){
                    left=false;
                     break;
                 }
              }
               for(int i=4;i<=7;i++){
                 if(hm.contains(i)){
                    middle=false;
                     break;
                 }
              }
               for(int i=6;i<=9;i++){
                 if(hm.contains(i)){
                    right=false;
                     break;
                 }
              }
              if(left && right){
                ans+=2;
              }
              else if(left||right){
                ans+=1;
              }
              else if(middle){
                ans+=1;
              }
         }
         return (int)ans;
    }
}