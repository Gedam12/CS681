package edu.umb.cs681.hw19;

public interface Queue {
	public int size();
	public void put(Runnable obj);
	public Runnable get();
}
