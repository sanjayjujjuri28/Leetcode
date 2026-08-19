class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        String str[] = new String[map.size()];
        int j = 0;
        for (String x : map.keySet()) {
            str[j++] = x;
        }
        Arrays.sort(str, (a, b) -> {
            if (map.get(a) != map.get(b)) {
                return map.get(b) - map.get(a);
            }
            return a.compareTo(b);
        });
        for(int i=0;i<k;i++){
            ans.add(str[i]);
        }
        return ans;
    }
}