public class RegularPolygonMain 
{
	public static void main(String[] args) 
	{
		RegularPolygon robj1 = new RegularPolygon();
		RegularPolygon robj2= new RegularPolygon(6, 4);
		RegularPolygon robj3= new RegularPolygon(10, 4, 5.6, 7.8);

		System.out.println("-------------------------------------------------");
		System.out.println("| Regular Polygon Objects |  Perimeter  |  Area |");
		System.out.println("-------------------------------------------------");
		System.out.printf( "|       Object-1         |%8.2f     |%6.2f  |\n", robj1.getPerimeter(), robj1.getArea());
		System.out.printf( "|       Object-2         |%8.2f     |%6.2f  |\n", robj2.getPerimeter(), robj2.getArea());
		System.out.printf( "|       Object-3         |%8.2f     |%6.2f  |\n", robj3.getPerimeter(), robj3.getArea());
		System.out.println("-------------------------------------------------");
		
		System.out.println();
		System.out.println("ID : 21CE142 \nName : Krishna M. Thakor");
	}
}