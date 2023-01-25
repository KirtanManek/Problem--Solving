class Solution {
    public void dfs(int u, int[] d, boolean[] vis, int[] edges) {
        vis[u] = true;
        int v = edges[u];
        if (v != -1 && !vis[v]) {
            d[v] = d[u] + 1;
            dfs(v, d, vis, edges);
        }
    }
    
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] d1 = new int[n];
        int[] d2 = new int[n];
        boolean[] vis1 = new boolean[n];
        boolean[] vis2 = new boolean[n];
        Arrays.fill(d1, Integer.MAX_VALUE);
        Arrays.fill(d2, Integer.MAX_VALUE);
        d1[node1] = d2[node2] = 0;
        dfs(node1, d1, vis1, edges);
        dfs(node2, d2, vis2, edges);
        int ans = -1, mi = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (Math.max(d1[i], d2[i]) < mi) {
                mi = Math.max(d1[i], d2[i]);
                ans = i;
            }
        }
        return ans;
    }
}
