import java.util.Scanner;

public class Practical6 
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter three side of the Triangle : ");
		double side1 = sobj.nextDouble();		
		double side2 = sobj.nextDouble();		
		double side3 = sobj.nextDouble();

		System.out.print("Enter Color : ");
		String color = sobj.next();

		System.out.print("Is the Triangle filled (true / false)? : ");
		boolean filled = sobj.nextBoolean();

		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is " + (triangle.isFilled() ? "" : "not ") + "filled");
		
		System.out.println();
		System.out.println("ID : 21CE142 \nName : Krishna M. Thakor");
		
		sobj.close();
	}
}