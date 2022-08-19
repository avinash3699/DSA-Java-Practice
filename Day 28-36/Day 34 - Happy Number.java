// Leetcode Program Link: https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {
        
        while(true){
            
            int newNum = getDigitsSquare(n);
            
            if(newNum == 1)
                return true;
            else if(newNum == 4)
                break;
            
            n = newNum;
            
        }
        
        return false;
        
    }
    
    public int getDigitsSquare(int num){
        
        int sum = 0;
        
        while(num > 0){
            int ud = num%10;
            sum += ud*ud;
            num /= 10;
        }
        
        return sum;
    }
}