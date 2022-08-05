// Print the word with odd letters as

/*
A     H
 V   S 
  I A  
   N   
  I A  
 V   S 
A     H
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
 		String S = new Scanner(System.in).next();
		
		for(int row = 0; row < S.length(); row++){
		    for(int col = 0; col < S.length(); col++){
		        if( (row == col) || (row + col == S.length()-1) )
		            System.out.print(S.charAt(col));
		        else 
		            System.out.print(" ");
		    }
		    System.out.println();
		}
		
	}
}