package edu.umb.cs681.hw11;

import java.util.concurrent.atomic.AtomicReference;

public class Aircraft {
	private AtomicReference <pos> position;
	public Aircraft(Position pos){ 
		position = new AtomicReference<>(pos); 
	}
	public void setPosition(Position pos){
		position.set(pos);;
	}
	public Position getPosition(){ 
		return this.position.get();
	} 
}