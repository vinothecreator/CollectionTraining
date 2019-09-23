package com.training;

import oracle.jrockit.jfr.events.DynamicValueDescriptor;

class M
{
	int i;
	double j;
	
M()
{

	System.out.println("No args");
	}

M(int i)
{
	this();
	this.i=i;
	System.out.println("int args");
	}

M(double b)
{
this(10);
	j=b;
	System.out.println("double args");
	
}

}
public class constructor {

	public static void main(String[] args) {
	M obj = new M(2.5);

	}

}
