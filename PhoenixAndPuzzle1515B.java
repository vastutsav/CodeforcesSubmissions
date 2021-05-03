import java.util.Scanner;

public class PhoenixAndPuzzle1515B {

	public static boolean isSquare(int n) {
		int i = 0;
		for (i = 1; i*i < n; ++i);
		return (i*i) == n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		while (T > 0) {
			T--;
			int n = sc.nextInt();
			if (n % 2 == 0 && (isSquare(n) || isSquare(n/2)))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}

}
