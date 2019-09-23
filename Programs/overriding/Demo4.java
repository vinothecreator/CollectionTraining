package com.qspiders.overriding;

//final keyword

class Area
{
	void areaCircle()
	{
		final double pi=3.14;
		pi=6.18;
		double r=8.2;
		double res=pi*r*r;
	}
}

public class Demo4 {
	
	final int i=5;

	public static void main(String[] args) {
		
		final int x;
		x=9;
		x=6;

	}

}
