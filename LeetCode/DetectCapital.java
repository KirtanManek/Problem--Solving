class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())) return true;
        else if(word.equals(word.toLowerCase())) return true;
        else if(Character.isUpperCase(word.charAt(0))) {
            char[] charArray = word.toCharArray();
            for(int i = 1; i < charArray.length; i++) {
                if(Character.isUpperCase(charArray[i])) return false;
            }
            return true;
        }
        return false;
    }
}
