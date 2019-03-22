package TestMain;

public class Prime {
	public static Boolean isDivisable(int prime, int curPrime) {
		if (curPrime % prime == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public String printPrimes(int n) {
		int curPrime;
		int numPrimes;
		boolean isPrime;
		int[] primes = new int[100];
		String reString = "";
		
		primes[0] = 2;
		numPrimes = 1;
		curPrime = 2;
		while(numPrimes < n) {
			curPrime++;
			isPrime = true;
			for(int i=0; i <= numPrimes-1; i++) {
				if(isDivisable(primes[i],curPrime)) {
					isPrime=false;
					break;
				}
			}
			if (isPrime) {
				primes[numPrimes]=curPrime;
				numPrimes++;	
			}	
		}
		for (int i = 0; i <= numPrimes-1; i++) {
				reString = reString + primes[i] + " ";
		}
		return reString;
	}

}
