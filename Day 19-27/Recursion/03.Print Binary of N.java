import java.util.Scanner;

public class Main{
    
    static void printBinary(int N){
        
        if(N <= 0)
            return;
            
        printBinary(N/2);
        
        System.out.print(N%2 + " ");
        
    }
    
	public static void main(String[] args) {
		
        int N = new Scanner(System.in).nextInt();
		
		printBinary(N);
		
	}
}