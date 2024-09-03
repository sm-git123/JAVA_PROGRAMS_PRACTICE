package m_questions_trying;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class occurenceofeachcharacter {

	public static void main(String args[])
	{
		String str ="geekofgeeeks";
		
		ArrayList<Character> al = new ArrayList<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			al.add(str.charAt(i));
		}
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			hm.putIfAbsent(al.get(i),Collections.frequency(al, al.get(i)));
		}
		for(Map.Entry<Character, Integer> m: hm.entrySet())
		{
			System.out.println("key and value::"+m.getKey() +"and"+m.getValue());
		}
	}
	
}
