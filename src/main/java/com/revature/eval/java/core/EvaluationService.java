package com.revature.eval.java.core;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {	
		// TODO Write an implementation for this method declaration
		String ans2,Uans;
		String ca = "";
		ca+=phrase.charAt(0);
//	int ci=1;
		for(int i=0; i<phrase.length(); i++ )
		{
			//c=phrase.charAt(i);
			
			if(phrase.charAt(i) ==' ' || phrase.charAt(i)== '-')
			{
				int ii=i+1;
			 ca+=phrase.charAt(ii);
			//ci++;
			}
				
		};
		
		  Uans = ca.toUpperCase();
		  //System.out.println(Uans);	
		return Uans;
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
			
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration
			boolean b=false;
			if (sideOne==sideTwo && sideTwo==sideThree) {
			b=true;
			}
			return b;
		}

		public boolean isIsosceles() {
		boolean b=false;
		 if (sideOne ==sideTwo || sideTwo==sideThree || sideOne==sideThree) {
			 b=true;
		 }
			 
			return b;
		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration
			boolean b=false;
			 if (sideOne !=sideTwo && sideTwo!=sideThree && sideOne!=sideThree) {
				 b=true;
			 }
			return b;
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
	
		// TODO Write an implementation for this method declaration
		
		return 0;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration

		
		String nums="0123456789";
		String tel2="";
		String tel="";
		
		try {
		for(int i=0; i<string.length(); i++ ) {
			
		//	if(string.charAt(i)>=0 && string.charAt(i)<=9) {
			if(nums.contains(String.valueOf(string.charAt(i)))) {
			tel+=string.charAt(i);	
			
			}
			//tel2=tel;
		}
	
		} catch(Exception e){
			
			System.out.println("Invalid number");
		}
		
		
		//System.out.println(tel);
		return tel;
		
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		StringBuilder s= new StringBuilder(string);
		s.
		return null;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
	          
	           int min=0;
	           int sl = sortedList.size();
	           int max=sl-1;
	           int m=0;
	           T l;
	           for(int i =0;i<sl;i++) {
	               m = (min+max)/2;
	               l = sortedList.get(m);
	               if(l.equals(t)) {
	                   break;
	               }else if ((int)l < (int)t) {
	                   min = (int)m+1;
	               }else if ((int)l > (int)t) {
	                   max = (int)m-1;
	               }
	           }
	           return m-0;
			
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) {
		// TODO Write an implementation for this method declaration
		String s = "A,E,I,O,U,a,e,i,o,u";
		//int i = 00;
	String s2="";
	String ans="";
	boolean case1=true;
		for(int i =0; i<s.length(); i++) {
			if(s.contains(string.valueOf(string.charAt(0)))){
					while(case1) {	
					case1=false;
					s2+=string+"ay";	
					ans=s2;	//	System.out.println(s2);
					}				
			}else {
					for(int j =1; j<s.length(); j++) {
						if(s.contains(string.valueOf(string.charAt(j)))){
							while(case1) {	
							case1=false;
							s2+= string.substring(j, string.length())+string.subSequence(0, j)+""+"ay";	
							System.out.println(s2);
							ans=s2;
							}
						}
					}
				
				}
			
		}		
		//String ans=" ";
		System.out.println(ans);
		return ans;
	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		int ans2;
		int ans3=0;
		int ans;
		int inputs=input;
				//int input=9474;
				String s=Integer.toString(inputs);
				
				int sl=s.length();
				for(int i=sl;i>0;i--) {
					System.out.println("in " + inputs);
				 ans= input%10;	
					ans2=(int)Math.pow(ans, sl);
					inputs=inputs/10;
					
				
				ans3+=ans2;
				System.out.println("out " + ans3);
				}
		
		return (input==ans3);
	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		
	        long ln = l;
	        List<Long> pf = new ArrayList<Long>();
	        for (long i = 2; i <= ln / i; i++) {
	            while (ln % i == 0) {
	                pf.add(i);
	                ln /= i;
	            }
	        }
	        if (ln > 1) {
	            pf.add(ln);
	        }
	        return pf;
	    
		
		
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
		
			this.key = key;
		}

		public String rotate(String string) {
			// TODO Write an implementation for this method declaration
			return null;
		}

	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int i) {
		// TODO Write an implementation for this method declaration
		int val=0;
		int counter=0;
		int j;
	    
	    while (counter < i){
	      val+=1;
	      for (j = 2; j <= val; j++){

	        if (val % j == 0) {
	          break;
	        }
	      }

	      if ( j == val){
	        counter+=1;
	      }
	    }

		return val;
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			// TODO Write an implementation for this method declaration
			return null;
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			return null;

		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
		// TODO Write an implementation for this method declaration
	//	String nums="0123456789x";
	   int jj=11;
	    int result=0;
	    
		
		ArrayList<Integer> list = new ArrayList<>(); 
		for(int i=0; i<string.length(); i++ ) {
			
		
				if(string.charAt(i)=='0') {
				list.add(0);
			}			if(string.charAt(i)=='1') {
				list.add(1);
			}			if(string.charAt(i)=='2') {
				list.add(2);
			}			if(string.charAt(i)=='3') {
				list.add(3);
			}			if(string.charAt(i)=='4') {
				list.add(4);
			}			if(string.charAt(i)=='5') {
				list.add(5);
			}			if(string.charAt(i)=='6') {
				list.add(6);
			}			if(string.charAt(i)=='7') {
				list.add(7);
			}			if(string.charAt(i)=='8') {
				list.add(8);
			}			if(string.charAt(i)=='9') {
				list.add(9);
			}
						if(string.charAt(i)=='x') {
				list.add(10);
			}
						if(string.charAt(i)=='X') {
							list.add(10);
						}
	
								
			}
//array list with values.
		//}
	System.out.println(list.toString());
	for(int j =0; j<10;j++) {
		jj--;
		System.out.println(jj+":"+j);	
		result+=list.get(j)*jj;
				
	
		
	}	
		
	
		
		return (result%11==0);
	}


	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 fdk The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
		return false;
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		// TODO Write an implementation for this method declaration
		return null;
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		// TODO Write an implementation for this method declaration
		int temp=0;
		int temp2=0;
		Set<Integer> s= new HashSet<>();
		int sl=set.length;
		for(int j =0; j<sl; j++) {
			int counter =1;
			temp=0;
				while((set[j]*counter)<i) {
					temp=set[j]*counter;
					s.add(temp);
					counter++;
				}
			 
		}
		for(int v: s) {
				 temp2=temp2+v;
				}
		System.out.println(temp2);

		return temp2;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		// TODO Write an implementation for this method declaration
		 int result2=0;
		    int result=0;
		    int jj;
		    
			//String string ="8569 2478 0383 3437";
			ArrayList<Integer> list2 = new ArrayList<>(); 
			
			for(int i=0; i<string.length(); i++ ) {
					
					if(string.charAt(i)=='0') {
					list2.add(0);
				}			if(string.charAt(i)=='1') {
					list2.add(1);
				}			if(string.charAt(i)=='2') {
					list2.add(2);
				}			if(string.charAt(i)=='3') {
					list2.add(3);
				}			if(string.charAt(i)=='4') {
					list2.add(4);
				}			if(string.charAt(i)=='5') {
					list2.add(5);
				}			if(string.charAt(i)=='6') {
					list2.add(6);
				}			if(string.charAt(i)=='7') {
					list2.add(7);
				}			if(string.charAt(i)=='8') {
					list2.add(8);
				}			if(string.charAt(i)=='9') {
					list2.add(9);
				}
				
										
				}
/**
 * 
 */
			 

			
			jj=list2.size()+1;
			for(int j =list2.size()-2; j>=0;j-=2) {
				
				jj-=2;
			
				result=list2.get(j)*2;
					if(result>9) {
						result2+=result-9;
					}else {
						result2+=result;
					}
				result2+=list2.get(jj);
				
			}	
			result2+=list2.get(0);
					System.out.print(result2);
		return (result2%10==0);
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		char gc;
		int scounter=0;
		int v1=0;
		int v2=0;
		String ns1 ="";
		String ns2="";
		String os3="";
		String string2 = string.replaceAll("[?]","");
		int nfi =0;
		int nbi=0;
		int obi=0;
		int n2fi=0;
		int n2bi=0;
		int ofi=0;
		int result=0;
		int sl=string2.length();
		for(int i = 0; i<sl;i++) 
		{
			
		gc=string2.charAt(i);
		if(gc==' '){
			
		scounter++;	
			if(scounter==2) {
				
			nfi=i+1;
			nbi=i+3;
			ns1=string2.substring(nfi,nbi);
			}
			if(scounter==3) {
				ofi=i+1;
					
			}
			
			if(scounter==4) {
				
				obi=i;
				os3=string2.substring(ofi, obi);	
				
				
			}
		if(scounter==5) {
			n2bi=i-1;
			n2fi=i+1;
			ns2=string2.substring(n2fi);
			
			
				}
			
		}//if statement ends here
			
		}//for loop ends here.
		//begins here
				if(os3.contentEquals("multiplied") ) {
					 v1= Integer.parseInt(ns1);
					 v2=Integer.parseInt(ns2);
					 
							result=v1*v2;
							System.out.println("Multi "+result);
								}
				if(os3.equalsIgnoreCase("plus")) {
					 v1= Integer.parseInt(ns1);
					 v2=Integer.parseInt(ns2);
							result=v1+v2;
								}
				if(os3.equalsIgnoreCase("minus")) {
					 v1= Integer.parseInt(ns1);
					 v2=Integer.parseInt(ns2);
							result=v1-v2;
								}
				if(os3.equals("divided")) {
					result=0;
					System.out.println("last first gate +"+ns1);
					System.out.println("last gate +"+ns2);
					System.out.println("last gate +");
					 v1= Integer.parseInt(ns1);
					 v2=Integer.parseInt(ns2);
							result=v1/v2;
								}
			
		
		return result;
	}
}