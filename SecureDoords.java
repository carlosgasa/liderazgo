import java.util.*;

public class SecureDoords{

	public static void main(String [] a){

		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> action = new ArrayList<String>();
		
		for(int i = 0; i<total+1; i++){
				String _temp = sc.nextLine();
				String[] temp = _temp.split(" ");
				if(i>0){
					names.add(temp[1]);
					action.add(temp[0]);
				}				
		}
		ArrayList<String> memory = new ArrayList<String>();
		for(int i = 0; i<total; i++){
			if(action.get(i).equals("entry")){
				if(memory.contains(names.get(i))){
					System.out.println(names.get(i) + " entered (ANOMALY)");
				}
				else{
					memory.add(names.get(i));
					System.out.println(names.get(i) + " entered");
				}
			}
			else{//exit
				if(memory.contains(names.get(i))){
					System.out.println(names.get(i) + " exited");
					memory.remove(names.get(i));
				}
				else{
					System.out.println(names.get(i) + " exited (ANOMALY)");
				}
			}
		}
	}
}

