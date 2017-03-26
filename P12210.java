import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class P12210{
	
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Integer> _b = new ArrayList<Integer>();
	
	public static void main (String args[]) {
		int i = 0;
		
		while(true){
			
			String in = sc.nextLine();
			
			if(!in.equals("0 0") && i != 25){
				String[] bs = in.split(" ");
				int b = Integer.parseInt(bs[0]);
				int s = Integer.parseInt(bs[1]);
			
				if(b >0 && b < 10000 && s > 0 && s < 10000){
					for(int j = 0; j<b;j++){
						int _in = sc.nextInt();
						if(_in >=2 && _in <=60) _b.add(_in);
					}
					for(int j = 0; j<s; j++){
						String _s = sc.nextLine();
					}
					sc.nextLine();
					Collections.sort(_b);
					if(b<=s) System.out.println("Case " + (i + 1) + ": 0");
					else System.out.println("Case " + (i + 1) + ": " + (b - s) + " " + _b.get(0));
				}
				else break;
			}
			else break;
			_b.clear();
			i++;
		}
	}
}

