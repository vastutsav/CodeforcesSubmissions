import java.util.Scanner;
import java.util.ArrayList;

public class KefaAndFirstSteps580A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int backIndex = 0;
		int maxStreak = 1;
		int n = sc.nextInt();
		ArrayList <Integer> money = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i) {
			money.add(sc.nextInt());
		}
		sc.close();
		
		int i = 0;
		for (i = 1; i < n; ++i) {
			if (money.get(i) < money.get(i-1)) {
				maxStreak = Math.max(maxStreak, (i - backIndex));
				backIndex = i;
			}
		}
		maxStreak = Math.max(maxStreak, (i - backIndex));
		
		System.out.println(maxStreak);
	}

}
