package m_questions_trying;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_ascending_Desacending {
	
	public static void main(String args[])
	{
		Integer[] arr = {9,5,0,3,4,8,2,7,1,5,6};
		int k=5;
		
		printArr(arr,k);
		System.out.println(Arrays.toString(arr));
	}
	public static void printArr(Integer[] a, int n)
	{
		int num = a.length;
		
		Arrays.sort(a,0,n);
		
		Arrays.sort(a, n, num,Collections.reverseOrder());;
	}
}
