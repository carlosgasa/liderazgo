import java.util.Scanner;

public class Omar {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());
    if(t >= 1 && t <= 100){
      String[] datos = new String[t];
      int[] x = new int[t];
      int[] y = new int[t];

      for(int i = 0; i<t;i++){
        String temp = sc.nextLine();
        String[] _temp = temp.split(" ");
        x[i] = Integer.parseInt(_temp[0]);
        y[i] = Integer.parseInt(_temp[1]);
      }
      for(int i = 0; i<t; i++){
        if(x[i] >= 0 && y[i] <= 100){
          System.out.println(x[i] + y[i] + "");
        }
        else{
          i = t+1;
        }
      }
    }
  }
}
