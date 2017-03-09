package org.nidhi.examples.oops.shape.sub;

import org.nidhi.examples.oops.shape.Shape;

public class Rectangle extends Shape
{
	public int calculateArea(int length, int width)
	{
		int area = length * width;
		System.out.println(area);
		return area;

	}

	/*
	 * public static void main(String[] args) { Scanner scan = new
	 * Scanner(System.in); System.out.println("Please enter inputs"); String
	 * inputShape = scan.next();
	 * 
	 * }
	 */

}