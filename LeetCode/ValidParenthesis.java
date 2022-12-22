class Solution {
    public boolean isValid(String s) {
        boolean ans = true;
        Stack<Character> stack = new Stack<>();
        if(s.length() % 2 != 0) ans = false;
        else{
            for(char c: s.toCharArray()){
                if(c == '(') stack.push(')');
                else if(c == '{') stack.push('}');
                else if(c == '[') stack.push(']');
                else if(stack.isEmpty() || stack.pop() != c) return false;
            }
            ans = stack.isEmpty();
        }
        return ans;
    }
}
