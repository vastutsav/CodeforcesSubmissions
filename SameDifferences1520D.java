import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

 
public class SameDifferences1520D {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap <Integer, Integer> hmap = new HashMap <Integer, Integer> ();
		int T = sc.nextInt();
		for (int t = 0; t < T; ++t) {
			int n = sc.nextInt();
			BigInteger cnt = new BigInteger("0");
			int arr = 0;
			for (int i = 0; i < n; ++i) {
				arr = sc.nextInt() - i;
				int a = 1;
			 	if (hmap.containsKey(arr)) {
					a = hmap.get(arr) + 1;
				}
				
				hmap.put(arr, a);
			}
			
			for (Integer k : hmap.keySet()) {
				int v = hmap.get(k);
				BigInteger combs = BigInteger.valueOf(v).multiply(BigInteger.valueOf(v-1)).divide(BigInteger.valueOf(2));
				cnt = cnt.add(combs);
			}

			hmap.clear();
			System.out.println(cnt);
		}
		sc.close();
 
	}
 
}