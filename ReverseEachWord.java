package m_questions_trying;

public class ReverseEachWord {
	
	public static void main(String args[])
	{
		
		String s ="fate is mightier than anything people and their thoughts decide my existence";
		
		String[] str = s.split(" ");
		String reverseword="";
		for(String word: str)
		{
			reverseword= reverseword + reverseConcat(word)+" ";
		}
		System.out.println("original string:"+s);
		System.out.println("reversed string:"+reverseword);
		
	}
	
	public static String reverseConcat(String w)
	
	{
		String reversew ="";
		for (int i=w.length()-1;i>=0;i--)
		{
			reversew=reversew+w.charAt(i);
		}
		return reversew;
	}

}
