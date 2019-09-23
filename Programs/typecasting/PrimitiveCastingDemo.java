package com.qspiders.typecasting;

public class PrimitiveCastingDemo {

	public static void main(String[] args) {

      int a=7;
      double b=a;  //Auto Widening
      
      System.out.println(b);
      
      int x=(int)9.7;  //Explicit Narrowing
	  System.out.println(x);

	}

}
