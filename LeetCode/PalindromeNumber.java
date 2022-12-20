// Problem Link : https://leetcode.com/problems/palindrome-number


class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return  false; 
        int reversed = 0, remainder, original = x;
        while(x != 0) {
            remainder = x % 10; // reversed integer is stored in variable
            reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
            x  /= 10;  //the last digit is removed from num after division by 10.
        }
        // palindrome if original and reversed are equal
        return original == reversed;
    }
}
