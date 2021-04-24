import java.util.Scanner;

public class wayTooLongWords71A {

	public static void main(String[] args) {
		// take input
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for (int i = 0; i < k; ++i) {
			String str = new String(sc.next());
			int l = str.length();

			// if word length < 11 print word
			// if greater then print the first char + length-2 + last char

			if (l < 11) 
				System.out.println(str);
			else 
				System.out.println("" + str.charAt(0) + (l-2) + str.charAt(l-1));
		}
		sc.close();
	}

}
