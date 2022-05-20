
public class JaggedArray {
	public static void main (String[] args) 
	{
	
		int nums [][]= 
			{
					{12,13,13},
					{11,21,22,24,24},
					{10,23,44,55}
			};
		
		for (int i =0; i < nums.length; i++) 
		{
			for (int k = 0; k < nums[i].length; k++) 
			{
				System.out.print(" " + nums [i] [k]);
				
			
			}
			
			System.out.println();
		}
	}

}
