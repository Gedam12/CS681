package edu.umb.cs681.hw13;

import java.nio.file.*;
import java.untill.Integer;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

public class AccessCounter {

	private HashMap<Path, Integer> accessCounterTable = new HashMap<>();
	private ReentrantLock lock = new ReentrantLock();

	public AccessCounter() {
		this.accessCounterTable = new HashMap<Path, Integer>();
	}

	public void increment(Path p) {
		lock.lock();
		int count = 1;
		try {
			if (accessCounterTable.containsKey(p)) {
				count = accessCounterTable.get(p) + 1;
			}
		} finally {
			accessCounterTable.put(p, count);
			System.out.println(
					Thread.currentThread().getName() + ": Call increment, path: " + p + " count: " + count + " times.");
			lock.unlock();
		}
	}

	public int getCount(Path p) {
		lock.lock();
		int count = 0;
		try {
			if (accessCounterTable.containsKey(p)) {
				count = accessCounterTable.get(p);
			}
		} finally {
			System.out.println(
					Thread.currentThread().getName() + ": Call getCount, path: " + p + " count: " + count + " times.");
			lock.unlock();
		}
		return count;
	}

}
