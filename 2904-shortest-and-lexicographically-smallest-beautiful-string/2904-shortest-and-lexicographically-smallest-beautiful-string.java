class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i = 0;
        int cnt = 0;
        String ans = "";

        for (int j = 0; j < s.length(); j++) {

            if (s.charAt(j) == '1') {
                cnt++;
            }

            while (cnt == k) {

                String curr = s.substring(i, j + 1);

                if (ans.equals("") ||
                    curr.length() < ans.length() ||
                    (curr.length() == ans.length() && curr.compareTo(ans) < 0)) {
                    ans = curr;
                }

                if (s.charAt(i) == '1') {
                    cnt--;
                }

                i++;
            }
        }

        return ans;
    }
}