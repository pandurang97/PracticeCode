package Program;

class Calculator{
	public int add(int n1,int n2)
	{
		return n1+n2;
	}
}
class AdvanceCalc extends Calculator{
	public int add(int n1, int n2)
	{
		return n1+n2+2;
	}
}

public class MethodOverridingSameParameters {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		AdvanceCalc Acal = new AdvanceCalc();
		
		int calculator=calc.add(3, 7);
		int advancedcals =Acal.add(12, 20);

System.out.println("Result calc"+"  "+calculator);
System.out.println("Result Adcalc"+" "+advancedcals);
	}

}
