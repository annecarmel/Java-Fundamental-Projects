import java.util.ArrayList;

class PrimeDirective {
  
  public boolean isPrime(int number) {
    if (number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    }
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int number : numbers) {
      if (isPrime(number)) {
        primes.add(number);
      }
    }
    return primes;
  }
  
  public static void main(String[] args) {
    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    
    // Test the isPrime() method
    System.out.println("6 is prime: " + pd.isPrime(6)); // should return false

    // Test the onlyPrimes() method
    ArrayList<Integer> primes = pd.onlyPrimes(numbers);
    System.out.println("Prime numbers: " + primes); // should print the list of prime numbers
  }  
}
