package IbrahimsMentoring;

public class FindPrimeNumbers {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for(int i = 0; i <= 200000000 ; i++){
            if(isPrime(i)) {
                System.out.println(i);
            }
        }

        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }

    public static boolean isPrime(int number){
        boolean prime = true;
        if(number < 2) return false;

        for(int i = 2; i < Math.sqrt(number); i++){
            if(number % i == 0){
                prime = false;
                break;
            }
        }

        return prime;
    }
}
