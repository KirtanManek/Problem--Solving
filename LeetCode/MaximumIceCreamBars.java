// Approach 1 : 
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



// Approach 2 :
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        for(int i = 0; i < costs.length; ++i) if( (coins -= costs[i]) < 0) return i;
        return costs.length;
    }
}
