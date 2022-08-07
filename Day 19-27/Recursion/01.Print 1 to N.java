import java.util.Scanner;

public class Main
{
    
    static void print1ToN(int N){
        
        if(N < 1)
            return;
        
        print1ToN(N-1);
        
        System.out.print(N + " ");
        
    }
    
	public static void main(String[] args) {
		
        int N = new Scanner(System.in).nextInt();
		
		print1ToN(N);
		
	}
}