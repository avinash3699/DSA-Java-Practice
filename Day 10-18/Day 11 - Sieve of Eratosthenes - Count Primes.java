// Leetcode Problem Link: https://leetcode.com/problems/count-primes/

// Sieve of Eratosthenes
class Solution {
    public int countPrimes(int n) {
        
        if(n <= 1) return 0;
        if(n <= 3) return n-2;
        
        boolean[] isPrime = new boolean[n+1];
//         for(int index = 0; index < n+1; index++)
//             isPrime[index] = true;
        Arrays.fill(isPrime, true);
        
        for(int num = 2; num*num <= n; num++){
            
            if(isPrime[num]){
                
                for(int i = num*num; i <= n; i += num)
                    isPrime[i] = false;
                
            }
            
        }
        
        int countOfPrimes = 0;
        
        for(int index = 2; index < isPrime.length - 1; index++)
            countOfPrimes += (isPrime[index])? 1: 0;
        
        return countOfPrimes;
        
    }
}
