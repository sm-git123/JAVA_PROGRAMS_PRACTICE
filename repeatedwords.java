package m_questions_trying;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class repeatedwords {
	
	public static void main(String args[])
	{
		String sentence  ="I am looking for better people and better world out of this bitter people and world";
		
		List<String> repeated = Arrays.stream(sentence.split("[. ]+")).collect(Collectors.toList());
		
		Set<String> repeatSet = new HashSet<String>();
	
		List<String> wordsRepeat = repeated.stream().filter(w->!repeatSet.add(w)).collect(Collectors.toList());
		System.out.println(wordsRepeat);
	
	}

}
