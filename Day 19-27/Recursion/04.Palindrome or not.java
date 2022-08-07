import java.util.Scanner;

public class Main
{
    
    static boolean isPalindrome(String S, int ptr1, int ptr2){
        
        if(ptr1 >= ptr2)
            return true;
            
        if(S.charAt(ptr1) != S.charAt(ptr2))
            return false;
        
        return isPalindrome(S, ptr1+1, ptr2-1);
        
    }
    
    
	public static void main(String[] args) {
		
		String S = new Scanner(System.in).next();
		System.out.print(isPalindrome(S, 0, S.length()-1)? "Yes": "No");
		
	}
}