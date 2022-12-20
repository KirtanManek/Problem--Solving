class Solution {
    public boolean isPalindrome(int x) {
        Palindrome p1 = new Palindrome();
        p1.content = Integer.toString(x);
        boolean ans = p1.checkPalindrome();
        return ans;
    }
}
class Palindrome{
    String content;
    String contentReverse = "";
    boolean checkPalindrome() {
        for (int i = content.length() - 1 ; i >= 0 ; i--) contentReverse += content.charAt(i);
        if (contentReverse.equals(content)) return true;
        else return false;
    }
}
