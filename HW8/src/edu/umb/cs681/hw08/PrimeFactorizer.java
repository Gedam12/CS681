package edu.umb.cs681.hw08;

import java.util.LinkedList;

public class PrimeFactorizer {
	protected long dividend, start, end;
	protected LinkedList<Long> factors = new LinkedList<Long>();
	
	public PrimeFactorizer(long dividend){
		if(dividend >= 2){
			this.dividend = dividend;
			this.start = 2;
			this.end = dividend;
		}else{
			throw new RuntimeException("Dividend must be  greater than or equal to 2. Dividend = "+ dividend);
		}
	}

	public long getDividend() { 
		return dividend; 
	}
	public long getStart(){
		return start; 
	}
	public long getEnd(){
		return end; 
	}
	public LinkedList<Long> getPrimeFactors(){
		return factors; 
	}
	
	public void generatePrimeFactors() {
		long divisor = 2;
	    while( dividend != 1 && divisor <= to ){
		    if(dividend % divisor == 0) {
		        factors.add(divisor);
		        dividend = dividend / divisor;
		    }else {
		    	if(divisor==2){ 
				divisor++; 
			}
		    	else{ 
				divisor += 2; 
			}
		    }
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Prime factors of 2: ");
		PrimeFactorizer fac = new PrimeFactorizer(2);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());
		
		System.out.print("Prime factors of 13: ");
		fac = new PrimeFactorizer(13);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());

		System.out.print("Prime factors of 233: ");
		fac = new PrimeFactorizer(233);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());
		
		System.out.print("Prime factors of 93: ");
		fac = new PrimeFactorizer(93);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());
		
		System.out.print("Prime factors of 225: ");
		fac = new PrimeFactorizer(225);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());
		
		System.out.print("Prime factors of 1567: ");
		fac = new PrimeFactorizer(1567);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());
		
		System.out.print("Prime factors of 7849: ");
		fac = new PrimeFactorizer(7849);
		fac.generatePrimeFactors();
		System.out.println(fac.getPrimeFactors());	
	}
}
