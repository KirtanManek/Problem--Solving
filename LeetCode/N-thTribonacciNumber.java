class Solution {
    public int tribonacci(int n) {
        int a = 0, b = 1, c = 1, d = 0;
        if (n == 0) return a;
        if (n == 1 || n == 2) return 1;
        for (int i = 3; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }
}
