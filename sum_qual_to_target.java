package m_questions_trying;

import java.util.Scanner;

public class sum_qual_to_target {
	
	public static void main(String args[])
	{
		int a[] = {0,1,2,3,5,7,8,9,4,10};
		
		System.out.println("Enter target");
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		int target = Integer.parseInt(t);
		SumOfTwoNumbers(a,target);
	}
	
	public static void SumOfTwoNumbers(int arr[], int t)
	{
		 if (arr.length < 2)
	            return;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp = arr[i]+arr[j];
				if(temp==t)
				{
					System.out.println(arr[i] + "and" + arr[j]);
				}
			}
		}
	}

}
