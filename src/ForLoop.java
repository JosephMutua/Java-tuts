import org.junit.Test;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Hello");
			
		
		}
		add();
		demo();
	
	}

	private static void add() {
		// TODO Auto-generated method stub
		
		for (int i = 1;i<=4;i++) {
		
			for (int i1=1;i1<=4;i1++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	@Test
	private static void demo() {
		
		for (int y=1; y<=10; y++) {
			
			if (y==5) {
				break;
			}
			System.out.println("The value is: " + y);
		}
	}

}
