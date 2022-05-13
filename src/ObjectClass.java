
class calc{
	int num1;
	int num2;
	int results;
	
	public void operator() {
		results = num1*num2;
	}
}



public class ObjectClass {
	
	public static void main(String[] args) {
		calc obj = new calc();
		obj.num1 = 3;
		obj.num2 = 5;
		
		obj.operator();
		System.out.println(obj.results);
		
	}

}
