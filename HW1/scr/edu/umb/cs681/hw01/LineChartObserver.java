package edu.umb.cs681.hw01;

public class LineChartObserver implements Observer<Double>{
	
	interface updateObserver {
		public void modifyObserver(Observable<Double> sender, Double event);
	}

	updateObserver update = (a,b) -> System.out.println("Event: " + b + ", Sender: " + a);
}
