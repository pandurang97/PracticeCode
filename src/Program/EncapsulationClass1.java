package Program;

public class EncapsulationClass1 {

	public static void main(String[] args) {
		EncapsulationClass EC = new EncapsulationClass();
		int m=EC.getx();
		System.out.println(m);
		
		EC.setx(44);
		System.out.println(EC.getx());
	}

}
