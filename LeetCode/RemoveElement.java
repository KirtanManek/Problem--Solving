// Problem Link : https://leetcode.com/problems/remove-element/

class Solution {
    public int removeElement(int[] nums, int val) {
        int picker = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[picker] = nums[i];
                picker++;
            }
        }
        return picker;
    }
}
