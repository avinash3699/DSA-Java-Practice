// Leetcode Problem Link: https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        
        Map<Character, Character> bracketPair = new HashMap<>(){
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }
        };
        
        Stack<Character> stack = new Stack<>();
        
        for(int index = 0; index < s.length(); index++){
            
            char curr = s.charAt(index);
            
            // if( (curr == '{') || (curr == '[') || (curr == '(') ){
            if ("({[".contains(curr + ""))
                stack.push(curr);
            else{
                if(stack.size() == 0)
                    return false;
                else if( stack.pop() != bracketPair.get(curr) )
                    return false;
            }

        }
        
        return stack.size() == 0;
        
    }
}