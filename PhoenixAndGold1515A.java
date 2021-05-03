import java.util.Scanner;


public class PhoenixAndGold1515A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		while (T>0) {
			T--;
			
			// take inputs
			int n, x;
			int [] g = new int [103];
			// List<Integer>list = Ints.asList(g);
			n = sc.nextInt();
			x = sc.nextInt();
			for (int i = 0; i < n; ++i) {
				g[i] = sc.nextInt();
			}
			
			// get sum
			int sum = 0;
			for(int i = 0; i < n; ++i) {
				sum+=g[i];
			}
			
			if (sum == x) {
				System.out.println("NO");
				continue;
			}
			
			if (sum < x ) {
				System.out.println("YES");
				for (int i= 0; i < n; ++i )
					System.out.print(g[i] + (i!=(n-1)?" ":"\n"));
				continue;
			}

			sum = 0;
			int [] tmp = new int [2000];
			int rc = 0;
			System.out.println("YES");
			for (int i = 0; i < n; ++i) {
				sum += g[i];
				if (sum == x) {
					tmp[rc++] = g[i];
					sum = sum - g[i];
					continue;
				}
				System.out.print(g[i] + (i!=(n-1)?" ":""));
			}
			if (rc == 0)
				System.out.println();
			else {
				for (int i = 0; i < rc; ++i)
					System.out.print(" " + tmp [i]);
				System.out.println();
			}
				
		}
		sc.close();

	}

}
