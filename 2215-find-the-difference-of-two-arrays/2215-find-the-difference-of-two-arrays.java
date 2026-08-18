class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> ls = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                n1.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                n2.add(num);
            }
        }

        ls.add(n1);
        ls.add(n2);

        return ls;
    }
}