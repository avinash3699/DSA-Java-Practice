import java.util.Scanner;

public class Main{
    
    static void printNTo1(int N){
        
        if(N < 1)
            return;
        
        System.out.print(N + " ");
        
        printNTo1(N-1);
        
    }
    
	public static void main(String[] args) {
		
        int N = new Scanner(System.in).nextInt();
		
		printNTo1(N);
		
	}
}