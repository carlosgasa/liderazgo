import java.util.Scanner;
import java.math.BigInteger;

public class sequence {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++){
			int lim = sc.nextInt();
			if (lim >= 1 && lim <= 1000000000){
				BigInteger t = new BigInteger(Integer.toString(lim));
				t = t.multiply(t);
				t = t.add(new BigInteger(Integer.toString(lim * 2)));
				System.out.println(t);
			}
		}
	}
}

