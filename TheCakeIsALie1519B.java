import java.util.*;
public class TheCakeIsALie1519B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; ++i) {
			int n, m, k;
			
			n = sc.nextInt();
			m = sc.nextInt();
			k = sc.nextInt();
			
			int option1 = (n-1) + n*(m-1);
			int option2 = (m-1) + m*(n-1);
			
			if (option1 == k || option2 == k)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}

}
