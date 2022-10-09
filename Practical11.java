import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

// Program to implement Triplet class in Java
public class Practical11 
{
	public static void main(String[] args) throws ExecutionException 
	{

		Triplet<String, Integer, Character> p1 = Triplet.of("Krishna Thakor", 19, 'F');
		Triplet<String, Integer, Character> p2 = Triplet.of("Drashti Panjrolia", 19, 'F');
		Triplet<String, Integer, Character> p3 = Triplet.of("Shivam Patel", 19, 'M');

		List<Triplet<String, Integer, Character>> pairs = new ArrayList<>();
		
		pairs.add(p1);
		pairs.add(p2);
		pairs.add(p3);
		System.out.println(pairs);
		
		Set<Triplet<String, Integer, Character>> distinctTriplets = new HashSet<>(pairs);
		System.out.println(distinctTriplets);
		
		System.out.println("\nID : 21CE142 \nName : Krishna M. Thakor");
	}
}