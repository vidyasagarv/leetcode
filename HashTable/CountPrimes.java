public class CountPrimes {
    public int countPrimes(int n) {
        if(n <= 2) {
            return 0;
        }
        boolean[] primes = new boolean[n];
        
        for(int i = 2; i < n; i++){
            primes[i] = true;
        }
        
        for(int i = 2; i <= Math.sqrt(n-1) + 1; i++){
            if(primes[i]){
                for(int j = 2; i*j < n; j++){
                    primes[i*j] = false;
                }
            }
        }
        
        int count = 0;
        for(int i = 2; i < n; i++){
            if(primes[i]){
                count++;
            }
        }
        return count;
    }
}