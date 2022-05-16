
class Emp{
	int id;
	int salary;
	static String ceo;
	
	public void show() {
		System.out.println(id + " : " + salary + " : " + ceo);
	}
}

public class StaticKeys {

	public static void main(String[] args) {
		
		Emp jose = new Emp();
		Emp John = new Emp();
		
		John.id = 23;
		John.salary = 4000;
		John.ceo = "Makau";
		
		jose.id = 24;
		jose.salary = 5000;
		jose.ceo = "Makau";
		
		Emp.ceo="Mustafa";
		
		John.show();
		jose.show();
		
	}

}

