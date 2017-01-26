import java.util.Scanner;

public class ModChallenges
	{
		static Scanner input=new Scanner(System.in);

		public static void main(String[] args)
			{
				leapYear();
				everyThird();
				fizzBuzz();

			}
		
		public static void leapYear()
		{
			System.out.println("Please type in a year.");
			int year=input.nextInt();
			if(year % 100==0)
				{
					System.out.println("Not a leap year.");
				}
			else if(year % 4==0)
				{
					System.out.println("Leap year.");
				}
			else
				{
					System.out.println("Not a leap year.");
				}
			System.out.println();
		}
		
		public static void everyThird()
		{
			int [] nums={2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
			for(int i=0; i<nums.length; i++)
				{
					if(nums[i] % 6==0)
						{
							System.out.print(nums[i] + " ");
						}
				}
			System.out.println();
		}
		public static void fizzBuzz()
		{
			for(int i=1; i<101; i++)
				{
					if(i % 15==0)
						{
							System.out.println("FizzBuzz");
						}
					else if(i % 5==0)
						{
							System.out.println("Buzz");
						}
					else if(i % 3==0)
						{
							System.out.println("Fizz");
						}
					else
						{
							System.out.println(i);
						}
				}
		}

	}
