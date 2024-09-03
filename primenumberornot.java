package m_questions_trying;

public class primenumberornot {
	
	public static void main(String args[])
	{
		int num =9;
		
		int start = 3;
		int end = 40;
		
		for (int i=start;i<=end;i++)
		{
			if(isPrime(i))
			{
			System.out.println( i );
			}
			
		}
		
		
	}
	
	public static boolean isPrime(int j)
	{
		if(j<=1)
			return false;
		
		for(int k=2;k<=Math.sqrt(j);k++)
		{
		if(j%k==0)
		{ return false;
		
		}
		
		}
		return true;
	}

}
