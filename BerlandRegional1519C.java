import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class BerlandRegional1519C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] u = new int [200001];
		int [] s = new int [200001];
		int t = sc.nextInt();
		for (int i = 0; i < t; ++i) {
			HashMap <Integer, ArrayList<BigInteger>> hmap= new HashMap <Integer, ArrayList<BigInteger>> ();
			int n = sc.nextInt();
			for (int j = 0; j < n; ++j) {
				u[j] = sc.nextInt();
			}
			for (int j = 0; j < n; ++j) {
				s[j] = sc.nextInt();
			}
			
			
			for (int j = 0; j < n; ++j) {
				if (hmap.containsKey(u[j])) {
					ArrayList <BigInteger> arr = hmap.get(u[j]);
					arr.add(BigInteger.valueOf(s[j]));
					hmap.put(u[j], arr);
					
				}
				else {
					ArrayList <BigInteger> arr = new ArrayList<BigInteger> ();
					arr.add(BigInteger.valueOf(s[j]));
					hmap.put(u[j], arr);
				}
			}
			
	        for (int j : hmap.keySet()) {
	        	Collections.sort(hmap.get(j), Collections.reverseOrder());
	        	ArrayList <BigInteger> arr = hmap.get(j);
	        	for (int k = 1; k < arr.size(); ++k) {
	        		arr.set(k, arr.get(k).add(arr.get(k-1)));
	        	}
	        	hmap.put(j, arr);
	        }
	        BigInteger prev = new BigInteger("999");
	        for (int j = 1; j <= n; ++j) {
	        	BigInteger tot = new BigInteger("0");
	        	if (prev.equals(BigInteger.ZERO)) {
	        		System.out.print("0 ");
	        		continue;
	        	}
	        	for (int k : hmap.keySet()) {
	        		ArrayList <BigInteger> arr = hmap.get(k);
	        		int lst = arr.size() - (arr.size()%j) - 1;
	        		BigInteger item = lst<0?BigInteger.ZERO:arr.get(lst); 
	        		tot = tot.add(item);
	        	}
	        	prev = tot;
	        	System.out.print(tot + " ");
	        }
	        System.out.println();
		}
		sc.close();
	}
}
