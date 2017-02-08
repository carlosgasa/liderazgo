import java.util.Scanner;

public class SpeedLimit{

  public static void main(String [] a){

    Scanner sc = new Scanner(System.in);
    String total = "";
    int exit = 0;
    do{
      int size = Integer.parseInt(sc.nextLine());
      exit = size;
      if(size>0){
        int[] speed = new int[size];
        int[] time = new int[size];

        for(int i = 0; i<size; i++){
            String temp = sc.nextLine();
            String[] _temp = temp.split(" ");
            speed[i] = Integer.parseInt(_temp[0]);
            time[i] = Integer.parseInt(_temp[1]);
        }
        int sum = 0;
        for(int i = 0; i<size; i++){
          if(i<1){
            sum = speed[i] * time[i];
          }else{
            sum = sum + speed[i] * (time[i] - time[i-1]);
          }
        }
        total = total + " " + sum;
      }
    }while(exit>0);

    String[] _total = total.split(" ");

    for(int i = 1; i<_total.length; i++){
      System.out.println(_total[i] + " miles");
    }
  }
}
