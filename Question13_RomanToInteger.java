
//Need to traverse a string character by character - another char array?
//Need to have 6 different cases for:
// IV (4), IX (9), XL (40), XC (90), CD (400), CM (900)
// Maybe something like ->
// * Turn the number into a character array, and add the numbers as they are
// * x[i] = 0, x[j] = i + 1
// * if x[i] == 'I' && x[j] == 'V', sum(x[i] + x[j] == 4
// And so on for each edge case 
// The default else will just be adding the numbers normally

//Problem is if you do a huge for loop, it will not add it right
//Maybe default case needs to be adding everything, and then do the rest as else statements
//Add everything, then if something is less subtract? no worse
//Going to see what it does without the elses then see how to adjust

//			int j = i + 1;
//			if (chars[i] == 'I' && chars[j] == 'V') {
//			int k = 5;

//I think we have to convert them and add them seperately
//For (items in char array) if a[i] = 'I', copy it into a separate int array with value 1
//Same if statement as before, if i and j are iv, add it to the array as 4
//Then do ANOTHER loop and add everything in the int array 

public class Question13_RomanToInteger {

	public static int romanToInt(String s) {

		// IV (4), IX (9), XL (40), XC (90), CD (400), CM (900)

		char[] chars = s.toCharArray();
//		System.out.println(chars);
		int n = chars.length;

		int sum = 0;

		// Maybe store the results of this first part in a temp variable
		// Then add it to the regular loop sum?

		for (int i = 0; i < n; i++) {
			int j = i + 1;
			if (chars[i] == 'I' && chars[j] == 'V') {
				sum = sum + 4;
				break;
			} else if (chars[i] == 'I' && chars[j] == 'X') {
				sum = sum + 9;
				break;
			} else if (chars[i] == 'X' && chars[j] == 'L') {
				sum = sum + 40;
				break;
			} else if (chars[i] == 'X' && chars[j] == 'C') {
				sum = sum + 90;
				break;
			} else if (chars[i] == 'C' && chars[j] == 'D') {
				sum = sum + 400;
				break;
			} else if (chars[i] == 'C' && chars[j] == 'M') {
				sum = sum + 900;
				break;
			} else {
				return -1;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
//		System.out.println(romanToInt("I"));
//		System.out.println(romanToInt("II"));
//		System.out.println(romanToInt("III"));
//		System.out.println(romanToInt("IIII"));
//		System.out.println(romanToInt("IV"));
//		System.out.println(romanToInt("V"));
//		System.out.println(romanToInt("VI"));

		// IV (4), IX (9), XL (40), XC (90), CD (400), CM (900)

		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("IX"));
		System.out.println(romanToInt("XL"));
		System.out.println(romanToInt("XC"));
		System.out.println(romanToInt("CD"));
		System.out.println(romanToInt("CM"));
		System.out.println(romanToInt("CMIV"));

	}

}

//} else if (chars[i] == 'I') {
//	sum = sum + 1;
//	break;
//} else if (chars[i] == 'V') {
//	sum = sum + 5;
//	break;
//}