package polimorphism;

class calculators{
	public int add(int a, int b) {
		return a+b;
	}
}
class advancecalc extends calculator{
	public int add(int a, int b) {
		return a+b;
	}
}
public class MethodOverriding {

	public static void main(String[] args) {

		calculator calc = new calculator();
		advancecalc advcalc = new advancecalc();
		int a = calc.add(20, 40);
		int b= advcalc.add(20, 34);
		System.out.println(a);
		System.out.println(b);
	}

}
