class Cal{
	int num1;
	int num2;
	int num3;
	
	public Cal(int num1, int num2,int num3){
		
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
}

public class UsingThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cal obj = new Cal(6,3,4);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.num3);

	}

}
