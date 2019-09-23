package com.training.interfacecode;

interface M
{

	void m1();
}

interface N extends M
{
void m2();	
}

class O implements N

{
public void m1()
{
	System.out.println("M1 implemented");
	}


public void m2()
{
	System.out.println("M2 implemented");
}
	}

public class Demo4 {

	public static void main(String[] args) {
		
		O obj= new O();
		obj.m1();
		obj.m2();
		
		
		
	}

}
