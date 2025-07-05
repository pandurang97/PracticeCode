package Program;

public class PublicWithinSameClass {

	public void sameclass()
	{
		System.out.println("Accessed within same class:");
	}
	public static void main(String[] args) {
		
		PublicWithinSameClass psc = new PublicWithinSameClass();
		psc.sameclass();

	}

}
