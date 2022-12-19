package edu.umb.cs681.hw10;

import java.util.LinkedList;

public class PrimeFactorizer {
	protected long dividend, from, to;
	protected LinkedList<Long> factors = new LinkedList<Long>();
	
	public PrimeFactorizer(long dividend){
		if(dividend >= 3){
			this.dividend = dividend;
			this.from = 3;
			this.to = dividend;
		}else{
			throw new RuntimeException("dividend must be >= 3. dividend==" + dividend);
		}
	}

	public long getDividend() { return dividend; }
	public long getFrom(){ return from; }
	public long getTo(){ return to; }
	public LinkedList<Long> getPrimeFactors(){ return factors; }
	
	public void generatePrimeFactors() {
		long divisor = 3;
	    while( dividend != 1 && divisor <= to ){
		    if(dividend % divisor == 0) {
		        factors.add(divisor);
		        dividend /= divisor;
		    }else {
		    	if(divisor==3){ divisor++; }
		    	else{ divisor += 3; }
		    }
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Prime factors of 6: ");
		PrimeFactorizer fac = new PrimeFactorizer(6);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());
		
		System.out.print("Prime factors of 27: ");
		fac = new PrimeFactorizer(27);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());

		System.out.print("Prime factors of 75: ");
		fac = new PrimeFactorizer(75);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());
		
		System.out.print("Prime factors of 84: ");
		fac = new PrimeFactorizer(84);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());
		
		System.out.print("Prime factors of 144: ");
		fac = new PrimeFactorizer(144);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());
		
		System.out.print("Prime factors of 489: ");
		fac = new PrimeFactorizer(489);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());
		
		System.out.print("Prime factors of 864: ");
		fac = new PrimeFactorizer(864);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());	
	}
}