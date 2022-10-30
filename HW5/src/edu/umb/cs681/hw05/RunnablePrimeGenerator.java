package edu.umb.cs681.hw05;

public class RunnablePrimeGenerator extends PrimeGenerator implements Runnable {
	
	public RunnablePrimeGenerator(long from, long to) {
		super(from, to);
	}
	
	public void run() {
		generatePrimes();
	}
	
	public void generateDoubleThread() {
		RunnablePrimeGenerator gen1 = new RunnablePrimeGenerator(1, 10000000);
		RunnablePrimeGenerator gen2 = new RunnablePrimeGenerator(10000001, 20000000);
		Thread t1 = new Thread(gen1);
		Thread t2 = new Thread(gen2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {}

		gen1.getPrimes().forEach( (Long prime)->System.out.print(prime + ", ") );
		gen2.getPrimes().forEach( (Long prime)->System.out.print(prime + ", ") );
		
		long primeNum = gen1.getPrimes().size() + gen2.getPrimes().size();
		System.out.println("\n" + primeNum + " prime numbers are found in total.");
	}
	
	public void generateSingleThread() {
		RunnablePrimeGenerator gen1 = new RunnablePrimeGenerator(1, 10000000);
		Thread t1 = new Thread(gen1);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {}

		gen1.getPrimes().forEach( (Long prime)->System.out.print(prime + ", ") );
		long primeNum = gen1.getPrimes().size();
		System.out.println("\n" + primeNum + " prime numbers are found in total.");
        
	}
	
	public void generateDoubleThread() {
		RunnablePrimeGenerator gen1 = new RunnablePrimeGenerator(1, 10000000);
		RunnablePrimeGenerator gen2 = new RunnablePrimeGenerator(10000001, 20000000);
		Thread t1 = new Thread(gen1);
		Thread t2 = new Thread(gen2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {}

		gen1.getPrimes().forEach( (Long prime)->System.out.print(prime + ", ") );
		gen2.getPrimes().forEach( (Long prime)->System.out.print(prime + ", ") );
		
		long primeNum = gen1.getPrimes().size() + gen2.getPrimes().size();
		System.out.println("\n" + primeNum + " prime numbers are found in total.");
	}
	
	public void generateQuadThread() {
		RunnablePrimeGenerator gen1 = new RunnablePrimeGenerator(1, 10000000);
		RunnablePrimeGenerator gen2 = new RunnablePrimeGenerator(10000001, 20000000);
		RunnablePrimeGenerator gen3 = new RunnablePrimeGenerator(20000001, 30000000);
		RunnablePrimeGenerator gen4 = new RunnablePrimeGenerator(30000001, 40000000);
		Thread t1 = new Thread(gen1);
		Thread t2 = new Thread(gen2);
		Thread t3 = new Thread(gen3);
		Thread t4 = new Thread(gen4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {}

		gen1.getPrimes().forEach( (Long prime)->System.out.print(prime + ", ") );
		gen2.getPrimes().forEach( (Long prime)->System.out.print(prime + ", ") );
		gen3.getPrimes().forEach( (Long prime)->System.out.print(prime + ", ") );
		gen4.getPrimes().forEach( (Long prime)->System.out.print(prime + ", ") );
		
		long primeNum = gen1.getPrimes().size() + gen2.getPrimes().size() + gen3.getPrimes().size() + gen4.getPrimes().size();
		System.out.println("\n" + primeNum + " prime numbers are found in total.");
	}
	

	public static void main(String[] args) {
		
		generateSingleThread();
		
		generateDoubleThread();
		
		generateQuadThread();
		
	}

}
