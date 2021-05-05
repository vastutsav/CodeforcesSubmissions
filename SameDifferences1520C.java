import java.util.Scanner;
 
public class SameDifferences1520C {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; ++t) {
			int n = sc.nextInt();
			int [] arr = new int [200001];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			int cnt = 0;
			for (int i = 0; i < n; ++i ) {
				for (int j = i+1; j < n; ++j) {
					if ((i-j) == (arr[i] - arr[j])) {
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
		sc.close();
 
	}
 
}