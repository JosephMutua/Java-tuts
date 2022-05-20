class Demo 
	{
	static class DemoInner
	{
		void demoShow() 
		{
			System.out.println("This is an static inner classe");
		}
	}
	}
public class StaticInnerClass {

	public static void main(String[] args) {
		Demo.DemoInner obj = new Demo.DemoInner();
		obj.demoShow();
		
	}

}
