import java.util.Scanner;

public class DoNotBeDistracted1520A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 0; t < T; ++t) {
			int n = sc.nextInt();
			String s = sc.next();
			boolean [] h = new boolean [27];
			for (int i = 0; i < 27; ++i)
				h[i] = false;
			int i = 0;
			for (i = 0; i < s.length(); ++i) {
				if (h[s.charAt(i) - 'A'] && s.charAt(i) != s.charAt(i-1))
					break;
				else
					h[s.charAt(i) - 'A'] = true;
			}
			if (i == s.length())
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
		sc.close();
		

	}

}
