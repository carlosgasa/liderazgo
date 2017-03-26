import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class P11292 {

	private static Scanner sc = new Scanner(System.in);

	public static void main (String args[]){

		while(true){
			String in = sc.nextLine();
			if(in.equals("0 0")) break;
			String[] _in = in.split(" ");
			boolean sw = true;

			int h = Integer.parseInt(_in[0]);
			int[] _h = new int[h];
			int k = Integer.parseInt(_in[1]);

			if(h>k) {
				p("Loowater is doomed!");
				sw = false;//continue;
			}

			for (int i = 0; i < h; i++){
				_h[i] = sc.nextInt();
			}

			ArrayList<Integer> _k = new ArrayList<Integer>();
			for (int i = 0; i < k; i++){
				_k.add(sc.nextInt());
			}

			Arrays.sort(_h);
			Collections.sort(_k);

			int sum = 0;
			int H = 0;
			if(sw == true) 
				for (int i = 0; i < h; i++){
					while (_k.size() != 0){
						if (_h[i] <= _k.get(0)){
							sum += _k.get(0);
							H++;
							_k.remove(0);
							break;
						}
						_k.remove(0);
					}
				}

			if(sw == true && h != H) p("Loowater is doomed!");
			else if(sw == true) p(sum + "");
			//_k.clear();
			sc.nextLine();
		}
	}
	
	public static void p(String s){
		System.out.println(s);
	}
}
