class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int t : tasks) {
            count.put(t, count.getOrDefault(t, 0) + 1);
        }
        int ans = 0;
        for (int c : count.values()) {
            if (c == 1) return -1;
            ans += c / 3;
            if(c % 3 != 0) ans++;
        }
        return ans;
    }
}
