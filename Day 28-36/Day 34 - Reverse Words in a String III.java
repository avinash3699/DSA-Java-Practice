// Leetcode Program Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    public String reverseWords(String s) {
        
        int ptr1 = 0, ptr2 = 0;
        char[] arr = s.toCharArray();
        
        while(ptr2 < s.length()){
            
            while( (ptr2 < s.length()) && (!Character.isSpace(arr[ptr2])))
                ptr2++;
            
            if(ptr2 >= s.length())
                break;
            
            int temp = ptr2--;
            
            while(ptr1 < ptr2){
                char tempChar = arr[ptr1];
                arr[ptr1++] = arr[ptr2];
                arr[ptr2--] = tempChar;
            }
            
            ptr1 = temp+1;
            ptr2 = temp+1;
            
        }
        
        ptr2 = s.length()-1;
        while(ptr1 < ptr2){
            char tempChar = arr[ptr1];
            arr[ptr1++] = arr[ptr2];
            arr[ptr2--] = tempChar;
        }
        
        String ss = "";
        for(int index = 0; index < arr.length; index++)
            ss += arr[index];
        
        return ss;
    }
}