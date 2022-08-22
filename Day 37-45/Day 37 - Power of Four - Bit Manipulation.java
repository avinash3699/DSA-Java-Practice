// Leetcode Program Link: https://leetcode.com/problems/power-of-four/

//Bit Manipulation

class Solution {
    public boolean isPowerOfFour(int n) {
        
        return (n > 0) && ((n & -n) == n) && ((n & 0x55555555) == n);
        
    }
}

// class Solution {
//     public boolean isPowerOfFour(int n) {
        
//         if(n <= 0)
//             return false;
        
//         return ((n & -n) == n) && ((n & 0x55555555) == n);
        
//     }
// }