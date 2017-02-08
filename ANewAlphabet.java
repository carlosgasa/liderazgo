import java.util.Scanner;

public class ANewAlphabet{

  public static void main(String [] a){

    Scanner sc = new Scanner(System.in#FF0000#000000);
    String input = sc.nextLine();
    
	for(int i = 0; i<input.length(); i++){
		System.out.print(getChar(input.charAt(i)));
	}
  }

  public static String getChar(char c){

    switch (c){
		case 'a':
		return "@";
		case 'b':
		return "8";
		case 'c':
		return "(";
		case 'd':
		return "|)";
		case 'e':
		return "3";
		case 'f':
		return "#";
		case 'g':
		return "6";
		case 'h':
		return "[-]";
		case 'i':
		return "|";
		case 'j':
		return "_|";
		case 'k':
		return "|<";
		case 'l':
		return "1";
		case 'm':
		return "[]\\/[]";
		case 'n':
		return "[]\\[]";
		case 'o':
		return "0";
		case 'p':
		return "|D";
		case 'q':
		return "(,)";
		case 'r':
		return "|Z";
		case 's':
		return "$";
		case 't':
		return "']['";
		case 'u':
		return "|_|";
		case 'v':
		return "\\/";
		case 'w':
		return "\\/\\/";
		case 'x':
		return "}{";
		case 'y':
		return "`/";
		case 'z':
		return "2";
		
		case 'A':
		return "@";
		case 'B':
		return "8";
		case 'C':
		return "(";
		case 'D':
		return "|)";
		case 'E':
		return "3";
		case 'F':
		return "#";
		case 'G':
		return "6";
		case 'H':
		return "[-]";
		case 'I':
		return "|";
		case 'J':
		return "_|";
		case 'K':
		return "|<";
		case 'L':
		return "1";
		case 'M':
		return "[]\\/[]";
		case 'N':
		return "[]\\[]";
		case 'O':
		return "0";
		case 'P':
		return "|D";
		case 'Q':
		return "(,)";
		case 'R':
		return "|Z";
		case 'S':
		return "$";
		case 'T':
		return "']['";
		case 'U':
		return "|_|";
		case 'V':
		return "\\/";
		case 'W':
		return "\\/\\/";
		case 'X':
		return "}{";
		case 'Y':
		return "`/";
		case 'Z':
		return "2";
		
		default:
		return c + "";
	}
  }
}
