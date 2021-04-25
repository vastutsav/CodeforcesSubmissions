import java.util.Scanner;
import java.math.BigInteger;

public class TheatreSquare1A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, a;
		int r = 0, c = 0;
		
		n = sc.nextInt();
		m = sc.nextInt();
		a = sc.nextInt();
		r = n/a + (n%a==0?0:1);
		c = m/a + (m%a==0?0:1);
		
		System.out.println(BigInteger.valueOf(r).multiply(BigInteger.valueOf(c)));
		sc.close();
	}

}
