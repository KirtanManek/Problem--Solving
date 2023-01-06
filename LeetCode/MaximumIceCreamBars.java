class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum = 0, count = 0;
        for(int i = 0; i < costs.length; i++){
            if(coins < costs[i]) break;
            else if(coins == 0) break;
            else if(coins >= costs[i]) {
                coins -= costs[i];
                count++;
            }
        }
        return count;
    }
}
