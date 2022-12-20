package edu.umb.cs681.hw012;

import java.util.*;

public abstract class FSElement {
	protected String name;
	protected Date lastModified;
	protected Date created;
	protected String owner;
	protected int size;
	protected Directory;

	
	public FSElement(String name, String owner, Date created, Directory parent) 
	
	{
		this.parent = parent;
		if (parent != null) {
			this.parent.appendChild(this);
		}
		
		this.created = created;
		this.lastModified = created;
		this.owner = owner;
		this.name = name;
	}

	public Directory getParent() 
	{
		return this.parent;
	}
	public String getName() {
		return this.name;
	}

	abstract public boolean isLeaf();

	public int getDiskUtil(){
		return this.size;
	}
}
