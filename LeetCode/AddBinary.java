// Problem Link: https://leetcode.com/problems/add-binary

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            int charA = i < 0 ? 0 : a.charAt(i--) - '0';
            int charB = j < 0 ? 0 : b.charAt(j--) - '0';
            ans.insert(0, (charA + charB + carry) % 2);
            carry = (charA + charB + carry) / 2;
        }
        return ans.toString();
    }
}
