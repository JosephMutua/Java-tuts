
public class TernaryDemo {
	public static void main(String[] args) {
		
		int i = 7;
		int j = 0;
		
		j = i > 6 ?1:2;
		System.out.println(j);
		
		switch(i) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("No case provided");
		
		
		}
		
	}

}
