package edu.umb.cs681.hw05;


public class PrimeNumberGenerator implements Runnable {

    protected long from, to;
    static Set<Long> primeList = new TreeSet<Long>();

    public PrimeNumberGenerator(long from, long to)
    {
        this.from = from;
        this.to = to;
    }


    public long count=0;

    public void run() {
        for(long n=from;n<=to;n++) {
            boolean isPrime = true;
            for(long i = 2; i<n; i++) {
                if(n % i==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
                synchronized(primeList) {
                   primList.add(n);
                }
            }
        }
    }

    public static ArrayList<Long> getPrimes(){
        
        return new ArrayList<>(primeList);
    }

    public static void main(String[] args) throws Exception {
        
        PrimeNumberGenerator gen1 = new PrimeNumberGenerator(1L,1000L);
        PrimeNumberGenerator gen2 = new PrimeNumberGenerator(1001L,2000L);
        Thread t1 = new Thread(gen1);
        Thread t2 = new Thread(gen2);
        t1.start();

        t2.start();
        t1.join();
        t2.join();
        PrimeNumberGenerator.getPrimes().forEach(primeList -> System.out.println(primeList));

    }
}
