
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Interview_Set_Star {

	

	//1.Swap two variables's values without using temp variable.
	
	//2.Write a method where u check to see if the word u pass is Anagram
	
	//3.Write a method where u reverse a sentence. Use 2 different methods
	
	//4.Write a method where u sort an Array without using the sort method
	
	//5.Write a method which returns how many times each letter is repeated?
    
	//6.A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801. Write a program that 	will verify if word is palindrome
	
	//7.In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 	3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of fibonacci series are 0 and 1. 	Given a number num, print n-th Fibonacci Number.
	
	//8.Write a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.EX: missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5

	//9.Create a method to check if the passing argument is a prime number
	
	//10.Can you write a method which finds remainder of 2 numbers without using the % operator? 

	
	public static void main(String[] args) {

		//swappingNumbers1(5,10);
		//System.out.println(isAnagram2("what up","up what"));
		//System.out.println(isReversed3("I love you"));
		int[] arr1 = {2,86,72,8};
		//sortArrayWithoutUsingSortMethod4(arr1);
		//System.out.println(countLetters5("Ozkanayasfdsalkjfasfjlk;asjfla;sjfl;ajfta"));
		//System.out.println(isPalindrome6("ozkan"));
		//fib7(6);
		//System.out.println(findMissingNumber8(new int[] {1,2,3,4,5,7,8,9,10}));
		//System.out.println(isPrime9(17));
		System.out.println(findRemainder10(15,10));
	}
	
	//10
	public static int findRemainder10(int dividend, int divisor) {
		
		if(dividend < divisor)
			return dividend;
		if(dividend == divisor)
			return 0;
		
		while(dividend >= divisor) {
			
			dividend-= divisor;
		}
		
		return dividend;
	}
	
	
	//9
	public static boolean isPrime9(int num) {
		
		if(num < 2)
			return false;
		if(num == 2)
			return true;
		
		for(int i = 2; i < num; i++) {
		
			if(num%i == 0)
				return false;			
		}
		return true;
	}
	
	
	//8
	public static int findMissingNumber8(int[] arr) {
		
		Arrays.sort(arr);
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] + 1 != arr[i + 1])
				return arr[i] + 1;
		}
		return 0;
	}
	
	
	

	//7
	public static void fib7(int num) {
		//0, 1, 1, 2, 3, 5, 8
		
		int result = 0;
		int a = 0;//first number
		int b = 1;//second number
		int c;//this is the next number
		
		if(num == 0)
			result = a;
		
		for(int i = 2; i <= num; i++) {
			c = a + b;
			a = b;
			b = c;			
		}
		result = b;
		
		System.out.println(result);
	}
	
	
	
	//6
	public static boolean isPalindrome6(String str) {
		
//		char[] ch1 = str.toCharArray();
//		
//		String strReversed = "";
//		for(int i = ch1.length - 1; i >= 0; i--) {
//			strReversed+= ch1[i] + "";
//		}
//		
//		char[] ch2 = strReversed.toCharArray();
//		
//		return Arrays.equals(ch1,ch2);
		
		
		for(int i = 0, j = 1; i < str.length()/2; i++, j++) {
			if(str.charAt(i) != str.charAt(str.length() - j))
				return false;
		}
		
		return true;
	}
	
	
	
	//5
	public static Map<String, Integer> countLetters5(String str){
		
//		String result = "";
//	    char[] array = str.toCharArray();
//	   int count = 0;
//	    
//	    for(int i = 0; i < array.length; i+=count){
//	      count = 0;
//	      for(int j = 0; j < array.length; j++){
//	        if(array[i] == array[j])
//	        count++;
//	      }
//	      
//	      result += count + "" + array[i]; 
//	    }
//	    return result;

		
		
		Map<String, Integer> map = new HashMap<>();
		
		
		String[] strMap = str.split("");
		
		for(String each : strMap) {
			
			if(!map.containsKey(each))
				map.put(each, 1);
			else
				map.put(each,each.length() + 1);
		}
		return map;
		
	}
	
	
	
	
	
	//4
	public static void sortArrayWithoutUsingSortMethod4(int[] arr) {
		//int[] arr = {2,86,72,8} --> {2,8,72,86} or {86,72,8,2}
		
		int temp;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr.length - 1; j++) {
				
				if(arr[j] < arr[j + 1]) { //--->if I switch > to < then it will be descending
					
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	

	
	//3
	public static String isReversed3(String str) {
		//I love you ---> you love I
		
		String result = "";
		
		String[] strArray = str.split(" ");
		for(int i = strArray.length - 1; i >= 0; i--) {
			result+= strArray[i] + " ";
		}
		
		return result;
	}
	
	//2
	public static boolean isAnagram2(String str1, String str2) {
		//Example: dear and read...

			
//		char[] ch1 = str1.toCharArray();
//		Arrays.sort(ch1);
//			
//		char[] ch2 = str2.toCharArray();
//		Arrays.sort(ch2);
//		return Arrays.equals(ch1,ch2);
		
			
			
		//second way of solution
		if(str1.length()!= str2.length())
			return false;
			
		String[] ch1 = str1.split("");
		String[] ch2 = str2.split("");
			
		Arrays.sort(ch1);
		Arrays.sort(ch2);
			
		for(int i = 0; i < ch1.length; i++) {
				
			if(!(ch1[i].equals(ch2[i])))
				return false;
				
		}
	 		
			return true;
		}
		
	
	
	//1
	public static void swappingNumbers1(int x,int y) {
		
		//temp way
		
		System.out.println("Before Temp " + x + "..." + y);

		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("After Temp " + x + "..." + y);
		
	    //Without using temp
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After without Temp " + x + "..." + y);

	}
	

}