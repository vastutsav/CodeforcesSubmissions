import java.util.Scanner;

public class Team231A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 0, b = 0, c = 0;
		int p = 0;
		
		for (int i = 0; i < n; ++i) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if (a+b+c > 1)
				p++;
		}
		System.out.println(p);
		sc.close();
	}

}
