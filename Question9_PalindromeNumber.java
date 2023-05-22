
public class Question9_PalindromeNumber {

	public static void main(String[] args) {

		int x = 111111111;
		String b = Integer.toString(x);
		char[] chars = b.toCharArray();
		System.out.println(chars);

		int n = chars.length;
		// Assigning j to the number of elements in the original array
		char[] backwards = new char[n];
		int j = n;
		
		//Reversing the array by assigning the elements in chars[i] (in regular order) to 
		//backwards[j-1] (the number of items in i, -1 to account for counting from 0) and decrementing
		for (int i = 0; i < n; i++) {
			backwards[j - 1] = chars[i];
			j = j - 1;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(backwards[i]);
		}

		System.out.println();

		String z = String.valueOf(x);
		String y = String.valueOf(backwards);
		
		boolean p = z.equals(y);
		System.out.println(p);

	}
}