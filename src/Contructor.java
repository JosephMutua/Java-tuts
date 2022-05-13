
class Calc{
	
	int num1;
	int num2;

	public Calc() {
		
		num1 = 12;
		num2 = 3;
	}
	public Calc(int n) {
		num1 = 12000;
		num2 = 3000;
	}
}

public class Contructor {
	public static void main(String[] args) {
		
		Calc obj = new Calc(4); // Constructor
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}
}
