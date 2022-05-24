
class Calcu
{
	public int add(int i, int j) 
	{
		return i+j;
	}
}

class CalcAdv extends Calcu
{
	public int sub(int i, int j)
	{
		return i - j;
	}
}

class CalcVeryAdv extends CalcAdv
{
	public int mult(int i, int j)
	{
		return i * j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) 
	{
		
		CalcVeryAdv c1 = new CalcVeryAdv();
		
		
		int results1= c1.add(2, 3);
		int results2= c1.sub(4, 2);
		int results3 = c1.mult(3, 4);
		
		
		
		System.out.println(results1);
		System.out.println(results2);
		System.out.println(results3);
		
	}

}
