package org.nidhi.examples.oops.shape;

import java.util.Scanner;

import org.nidhi.examples.oops.shape.sub.Rectangle;
import org.nidhi.examples.oops.shape.sub.Square;

public class Shape
{
	public static void main(String[] args)
	{
		Rectangle rectangleObject = new Rectangle();
		Square squareObject = new Square();

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter inputs");
		int inputShape = scan.nextInt();

		rectangleObject.calculateArea(inputShape, inputShape);
		squareObject.calculateArea(inputShape);

	}

}
