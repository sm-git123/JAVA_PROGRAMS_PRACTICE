package m_questions_trying;

public class removevowels {
	
	public static void main(String args[])
	{
		String str = "iamabladiyidioticwomen";
		//String[] strArr= str.split(" ");
		String removedVer = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println("removed string::"+removedVer);
	}

}
