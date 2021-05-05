import java.util.HashMap;
import java.util.Scanner;

 
public class SameDifferences1520D {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap <Integer, Integer> hmap = new HashMap <Integer, Integer> ();
		int T = sc.nextInt();
		for (int t = 0; t < T; ++t) {
			int n = sc.nextInt();
			int cnt = 0;
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
				cnt += (int) ((v)*(v-1)/2);
			}

			hmap.clear();
			System.out.println(cnt);
		}
		sc.close();
 
	}
 
}