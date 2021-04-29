import java.util.Scanner;

public class RedAndBlueBeans1519A {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t>0) {
			--t;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int mx = Math.max(a, b);
			int mn = Math.min(a, b);
			int d = mx%mn==0?0:1;
			int e = (int)mx/mn;
			
			if (e+d-1 <= c && a > 0 && b > 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}
