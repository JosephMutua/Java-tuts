
class Calcde{
	int num1;
	int num2;
	int results;
	
	public void operator() {
		results = num1*num2;
	}
}



public class ObjectClass {
	
	public static void main(String[] args) {
		Calcde obj = new Calcde();
		obj.num1 = 3;
		obj.num2 = 5;
		
		obj.operator();
		System.out.println(obj.results);
		
	}

}
