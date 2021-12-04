package ru.AndrewLevchenko;

/*Problem:
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.


Note: run as "java -cp ./..package folder../ru.AndrewLevchenko.problem_4"
*/


public class problem_4 {

	public static void main(String[] args) {
		int max=1;
		
		for (int i=9;i>0;i--) 
			for (int j=9; j>=0; j--) 
				for (int k=9; k>=0; k--)
				{
					int number=i*100001+j*10010+k*1100;
					for (int l=999; l>99; l--)
					{
						if ((number%l==0) && (max<number) && (number/l<1000))
						{
							max=number;
						
						}
						
							
					}
				}
				
			

		
		System.out.print(max+"\n");
		return;


	}
}
