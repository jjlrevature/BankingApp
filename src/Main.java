import java.util.Scanner;


public class Main {
	static boolean b = true;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Printer.firstMenu();
		int i = Input.collectIntInput(sc);
		
		
		do {
			Parser.parse(b, sc, i);
		}while(b);
		
		sc.close();
	}
	
	
}
