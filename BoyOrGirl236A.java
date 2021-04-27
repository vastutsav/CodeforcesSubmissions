import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl236A {

	public static void main(String[] args) {
		HashSet <Character> hs = new HashSet<Character>();
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();

		for (int i = 0; i < inp.length(); ++i) {
			hs.add(inp.charAt(i));
		}
		if (hs.size()%2 == 0) {
			System.out.println("CHAT WITH HER!\n");
		}
		else {
			System.out.println("IGNORE HIM!\n");
		}
		sc.close();
	}

}
