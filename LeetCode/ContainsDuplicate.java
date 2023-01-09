class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap size = new HashMap();
        for (int n : nums) {
            size.put(n,null);
        }
        return size.size() != nums.length;
    }
}
