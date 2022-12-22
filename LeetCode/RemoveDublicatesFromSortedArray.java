// Problem link : https://leetcode.com/problems/remove-duplicates-from-sorted-array
//Here you do not have to remove the dublicates, you have to shift all dublicates to the end of nums[] array.
//After that return the number of non dublicate elements.

class Solution {
    public int removeDuplicates(int[] nums) {
        int picker = 0;
        for(int i = 0; i < nums.length; i++){ 
            if(nums[i] != nums[picker]){      //As soon as an elements comes with non dublicate value it will be executed.
                nums[++picker] = nums[i];     //The non dublicate element will be placed at the first occurence of dublicate element
            }
        }
        return picker + 1;      // return number of non dublicate elements
    }
}
