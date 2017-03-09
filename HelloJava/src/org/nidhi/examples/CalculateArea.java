package org.nidhi.examples;

import java.util.Scanner;

public class CalculateArea
{

	int calculateAreaRectangle(int length, int width)
	{
		int area = length * width;
		return area;

	}

	int calculateAreaSquare(int side)
	{
		int area = side * side;
		return area;
	}

	/**
	 * 
	 * @param l
	 * @param w
	 * @param d
	 * @return
	 */
	int calculateAreaTriangle(int l, int w, int d)
	{
		int area = l * w * d;
		return area;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Shape");
		String inputShape = scan.next();
		CalculateArea calculateAreaObject = new CalculateArea();
		int length;
		int width;
		int result;
		if (inputShape.equals("rectangle"))
		{
			System.out.println("Please enter length");
			length = scan.nextInt();
			System.out.println("Please enter width");
			width = scan.nextInt();
			result = calculateAreaObject.calculateAreaRectangle(length, width);
			System.out.println(result);
		} else if (inputShape.equals("square"))
		{
			System.out.println("Please enter side");
			length = scan.nextInt();
			result = calculateAreaObject.calculateAreaSquare(length);
			System.out.println(result);
		} else if (inputShape.equals("triangle"))
		{
			System.out.println("Please enter length");
			length = scan.nextInt();
			System.out.println("Please enter width");
			width = scan.nextInt();
			System.out.println("Please enter depth");
			int depth = scan.nextInt();
			result = calculateAreaObject.calculateAreaTriangle(length, width, depth);
			System.out.println(result);
		} else
		{
			System.out
					.println("Shape not supported, please enter any values from these tree(triangle,square,rectangle)");
			main(null);
		}
		scan.close();

	}
}
