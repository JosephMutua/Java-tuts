
class AddArr{
	
	public static int add(int ... n)
	{
		int sum =0;
	 for (int d : n)
	 {
		 sum=sum+d;
	 }
	 return sum;
	}
}

public class VarArgs {

	public static void main(String[] args) {
		
		AddArr obj = new AddArr();
		
		System.out.println(obj.add(12,12,1,3));
		

	}

}
