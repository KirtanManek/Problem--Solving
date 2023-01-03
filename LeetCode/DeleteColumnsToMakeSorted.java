class Solution {
    public int minDeletionSize(String[] strs) {
        int columnsCount = 0;
        for(int i = 0; i < strs[0].length(); i++) {
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    columnsCount++;
                    break;
                }
            }
        }
        return columnsCount;
    }
}
