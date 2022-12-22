class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case 'I' -> ans += 1;
                case 'V' -> ans += 5;
                case 'X' -> ans += 10;
                case 'L' -> ans += 50;
                case 'C' -> ans += 100;
                case 'D' -> ans += 500;
                case 'M' -> ans += 1000;
            }
        }
        return ans;
    }
}
