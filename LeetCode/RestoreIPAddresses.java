class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        int n = s.length();
        for (int i = 1; i < 4 && i < n; i++) {
            for (int j = i + 1; j < i + 4 && j < n; j++) {
                for (int k = j + 1; k < j + 4 && k < n; k++) {
                    String seg1 = s.substring(0, i),
                           seg2 = s.substring(i, j),
                           seg3 = s.substring(j, k), 
                           seg4 = s.substring(k);
                    if (ok(seg1) && ok(seg2) && ok(seg3) && ok(seg4)) {
                        ans.add(seg1 + "." + seg2 + "." + seg3 + "." + seg4);
                    }
                }
            }
        }
        return ans;
    }
    private boolean ok(String s) {
        if (s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }
}
