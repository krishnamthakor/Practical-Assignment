public class ComparableSquare extends Square 
		implements Comparable<ComparableSquare> {

	public ComparableSquare() 
	{
	}

	public ComparableSquare(double side) 
	{
		super(side);
	}

	public ComparableSquare(double side, String color, boolean filled) 
	{
		super(side, color, filled);
	}

	public int compareTo(ComparableSquare o) 
	{
		if (getArea() > o.getArea())
		{
			return 1;
		}
		
		else if (getArea() < o.getArea())
		{
			return -1;
		}
		
		else
		{
			return 0;
		}
	}

	public String toString() 
	{
		return super.toString() + "\nArea: " + getArea();
	}
}