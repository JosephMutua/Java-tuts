
class OuterClass
 {
	public void outer() 
	{
		System.out.println("This is the outer Class");
	}
	
	class InnerClass
	{
		public void inner() 
		{
			System.out.println("This is the inner class");
		}
	}
 }

public class InnerClass {

	public static void main(String[] args) {
		
		OuterClass obj = new OuterClass();
		
		obj.outer();
		
		OuterClass.InnerClass obj1 = obj.new InnerClass();
		
		obj1.inner();
		
		
		

	}

}
