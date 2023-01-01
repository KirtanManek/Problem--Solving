class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");

        if(str.length != pattern.length()) return false;
        
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(int i = 0; i < str.length; i++) {
            char temp = pattern.charAt(i);
            if(map.containsKey(temp)) {
                if(!map.get(temp).equals(str[i])) {
                    return false;
                }
            }
            else if(set.contains(str[i])) return false;
            else {
                set.add(str[i]);
                map.put(temp, str[i]);
            }
        }
        return true;
    }
}
