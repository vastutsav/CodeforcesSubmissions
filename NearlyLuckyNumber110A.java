import java.math.BigInteger;
import java.util.Scanner;

public class NearlyLuckyNumber110A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		BigInteger n = new BigInteger(in);
		int count = 0, cLucky = 0, cNotLucky = 0;
		while (n.compareTo(BigInteger.ZERO) != 0) {
			long digit = n.mod(BigInteger.TEN).longValue();
			if (digit == 7 || digit == 4)
				count++;
			n=n.divide(BigInteger.TEN);
		}
		
		while (count != 0) {
			int digit = count%10;
			if (digit == 4 || digit == 7) {
				cLucky++;
			}
			else {
				cNotLucky++;
			}
			count=count/10;
		}
		if (cLucky!=0 && cNotLucky==0)
			System.out.println("YES\n");
		else
			System.out.println("NO\n");
		
		sc.close();
	}

}
