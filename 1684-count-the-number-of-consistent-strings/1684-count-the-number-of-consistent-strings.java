class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
          HashSet<Character>set=new HashSet<>();
          for(int i=0;i<allowed.length();i++){
              set.add(allowed.charAt(i));
          }
          int cnt=0;
          for(int i=0;i<words.length;i++){
              boolean check=true;
              for(int j=0;j<words[i].length();j++){
                  char ch=words[i].charAt(j);
                  if(!set.contains(ch)){
                    check=false;
                     break;
                  }
              }
              if(check){
                cnt++;
              }
          }
          return cnt;
    }
}