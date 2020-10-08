package com.alphabet.gmail.encapsulationtopic;

class Father
{
	public void smoking()
	{
		System.out.println("Normal Smoker");
	}
}


class Son extends Father 
{
	@Override
	public void smoking()
	{
		System.out.println("Chain Smoker");
	}
}



@SuppressWarnings("unused")
public class Sample {

	public static void main(String[] args) 
	{
		Son s1 = new Son();
		s1.smoking();
	}
	
}
