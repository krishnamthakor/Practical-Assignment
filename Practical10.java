public class Practical10
{
	public static void main(String[] args) 
	{
		ComparableSquare comparableSquare1 = new ComparableSquare(12);
		ComparableSquare comparableSquare2 = new ComparableSquare(18);

		System.out.println("\nComparable Square 1 : ");
		System.out.println(comparableSquare1);
		System.out.println("\nComparable Square 2 : ");
		System.out.println(comparableSquare2);

		System.out.println((comparableSquare1.compareTo(comparableSquare2) == 1 ? "\nComparable Square 1 " : "\nComparable Square 2 ") + "is the larger of the two Squares.");
		
		System.out.println("\nID : 21CE142 \nName : Krishna M. Thakor");
	}
}