package com.typecast;

class Addition
{
int add(int a,double b)
{
	return (int)(a+b);
}

}

public class PrimitiveCastingEx {

public static void main(String[] args) {
	
	Addition obj=new Addition();
	double res=obj.add((int)9.2,7);
	System.out.println(res);
	

}

}

