import java.util.HashSet;
import java.util.Scanner;
public class BeautifulYear271A {

	public static void main(String[] args) {
		boolean isBeautiful = true;
		Scanner sc = new Scanner(System.in);
		HashSet <Integer> hset= new HashSet<Integer>();
		int year = sc.nextInt();
		int tmp = 0;
		while (true) {
			hset.clear();
			isBeautiful = true;
			year++;
			tmp = year;
			while(tmp!=0) {
				int digit = tmp%10;
				if (hset.contains(digit)) {
					isBeautiful = false;
					break;
				}
				else {
					hset.add(digit);
				}
				tmp/=10;
			}
			if (isBeautiful) {
				break;
			}
		}
		System.out.println(year);
		sc.close();
	}
}