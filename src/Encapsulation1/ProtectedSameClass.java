package Encapsulation1;

public class ProtectedSameClass {

	protected void add() {
		System.out.println("Protected data from same class");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedSameClass psc = new ProtectedSameClass();
		psc.add();
	}

}
