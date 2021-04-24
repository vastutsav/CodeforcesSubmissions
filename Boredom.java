import java.util.Scanner;

public class Boredom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		long[] count = new long[100001];
		long[] dp = new long[100001];
		
		// get frequency of each number
		for (int i = 0; i < k; ++i) {
			int d = in.nextInt();
			count[d]++;
		}
		
		// initialize base cases
		dp[0] = 0;
		dp[1] = count[1];
		
		// dp
		for (int i = 2; i <= 100000; ++i) {
			dp[i] = Math.max(dp[i-1], dp[i-2]+count[i]*(long)i);
		}
		System.out.println(dp[100000]);
		in.close();
	}

}
