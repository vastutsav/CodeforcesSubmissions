import java.util.Scanner;

public class OrdinaryNumber1520B {

	public static int noOfDigs(int n) {
		int i = 0;
		while (n!=0) {
			i++;
			n = n/10;
		}
		
		return i;
	}
	
	public static int get1s(int d) {
		int a = 0;
		for (int i = 0; i < d; ++i) {
			a = a*10 + 1;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; ++t) {
			int n = sc.nextInt();
			int d = noOfDigs(n);
			int f = 9 * (d-1);
			int l = (int)(n/get1s(d));
			System.out.println(f+l);
		}
		sc.close();
	}

}
