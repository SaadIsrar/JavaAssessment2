public class OfflineExercises {
	public void doubleChar(String input) {
		String s = "The";
		String result = "";
		int i = 0;
		while (i < s.length()) {
			char c = s.charAt(i);
			result = result + c + c;
			i++;
			System.out.println(s);



		}

	}
		String v = "AAbb";
		String result;
		int i = 0;
		while (i < v.length()) {
			char c = v.charAt(i);
			result = result + c + c;
			i++;
			System.out.println(v);



		}

	String x = "Hi-There";
	String result;
	int u = 0;
		while (i < x.length()) {
		char c = v.charAt(i);
		result = result + c + c;
		i++;
		System.out.println(v);



	}
	String m = "Hi-There";
	String result;
	int y = 0;
		while (i < m.length()) {
		char c = m.charAt(i);
		result = result + c + c;
		i++;
		System.out.println(m);



	}







	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""
	// getSandwich("xxbreadhoneybreadyy") → "honey"
	public String getSandwich(String input) {



		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int abc001 = 0;
		int efg002 = 0;
		int hij003 = 0;

		if (a == b && a == c)
			return true;
		if (a == b || b == c || a == c)
			return false;
		abc001 = Math.abs(a - b);
		efg002 = Math.abs(a - c);
		hij003 = Math.abs(b - c);

		if (abc001 == efg002) ;
		return true;
		if (abc001 == hij003) ;
		return true;
		if (efg002 == hij003) ;
		return true;

		return false;
	}


	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		return "";
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false
	// endsLy("l") → false

	public boolean endsly(String input) {
		return false;
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {

		return "";
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1
	// fibonacci(3) → 2
	// fibonacci(4) → 3
	// fibonacci(5) → 5
	// fibonacci(6) → 8
	// fibonacci(25) → 75025

	public int fibonacci(int input){
		if (n == 0) return 0;
		if (n == 1) return 1;
		else return (fibonacci(n-2) + fibonacci(n-1));

		return -1;
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).

	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4
	// bunnyEars(4) → 8
	// bunnyEars(16) → 32

	public class BunnyEars {
		public  int countEars(int placeInLine) {
			if (placeInLine == 0) return 0;
			int currentBunnyCount = (placeInLine%2 == 0) ? 3 : 2;
			return currentBunnyCount + countEars(placeInLine -1);

			public static void main(String[] args) {
				assert countEars(0)==0;
				assert countEars(1)==2;
				assert countEars(2)==4;
				assert countEars(4)==8;
				assert countEars(16)==32;
			}
		return -1;
	}
}
	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.

	// superBlock("jeffbert") → 2
	// superBlock("abbCCCddBBBxx") → 3
	// superBlock("") → 0

	public int superBlock(String str) {
		return -1;

	}

}
