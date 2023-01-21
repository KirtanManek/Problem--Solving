class Solution {
    public void solve(int[] nums, int index, List<Integer> output, Set<List<Integer>> ans) {
        if (index >= nums.length) {
            if (output.size() > 1) {
                ans.add(new ArrayList<>(output));
            }
            return;
        }
        if (output.isEmpty() || nums[index] >= output.get(output.size() - 1)) {
            output.add(nums[index]);
            solve(nums, index+1, output, ans);
            output.remove(output.size() - 1);
        }
        solve(nums, index+1, output, ans);
    }
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        solve(nums, 0, new ArrayList<>(), ans);
        return new ArrayList<>(ans);
    }
}
