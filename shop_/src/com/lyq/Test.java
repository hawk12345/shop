package com.lyq;

public abstract class Test 
{
	public Test(Integer i)
	{
		System.out.println("1");
	}
	public Test(Long i)
	{
		System.out.println("2");
	}
	public Test(Double i)
	{
		System.out.println("3");
	}
	public Test(Float i)
	{
		System.out.println("4");
	}
	public static void main(String[] args) {
		//new Test(100.0*100);
		double d = 0d;
		float f = 1f;
		System.out.println("I love You");
	}

}
