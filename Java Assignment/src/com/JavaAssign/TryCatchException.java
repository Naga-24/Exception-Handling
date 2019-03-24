package com.JavaAssign;

public class TryCatchException {

	public static void main(String[] args) {
		System.out.println("start");
		try {
		int c=10/0;
		System.out.println("c value is  "+c);
		}
		catch (Exception e)
		{
		System.out.println("Something went wrong  "+e.getMessage());
		}
		System.out.println("End");
	}

}
