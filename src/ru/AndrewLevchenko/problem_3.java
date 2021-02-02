package ru.AndrewLevchenko;

/*Problem:
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?

Note: run as "java -cp ./..../ru.AndrewLevchenko.problem_3 600851475143"
*/



public class problem_3 {

	public static void main(String[] args) {
		long number=Long.parseLong(args[0]);
		long numbertemp=number;
		long limit=(int)Math.sqrt(number);
		
		for (long i=3; i<limit; i+=2)
		{
			if (numbertemp%i==0)
			{
				do
				{
					numbertemp=numbertemp/i;
				}
				while (numbertemp%i==0);
			}
			if (numbertemp==1)
			{
				System.out.print("The biggest divisor of " + number+ " is equal to "+ i+"\n");
				break;
			}
		}

	}

}
