
public class Arrays2d {

	public static void main(String[] args) {
		
		int nums[] [] = {
				{12,13,14,15},
				{16,17,14,13},
				{21,32,25,26}
		}; 
		
		for (int i =0; i < 3;i++) 
		{
			
			for (int j=0;j<4;j++) 
			{
				System.out.print(" " + nums [i] [j]);
			}
			
			System.out.println();
		}
		
	for (int k[] : nums) 
	{
		for (int q : k) 
		{
			System.out.print(" " + q);
		}
		
		System.out.println();
	}

	}

}
