import java.util.Scanner;

public class Parser {
	
	
	public static void parse(boolean b, Scanner sc, int first) {
		
		
		switch(first) {
		case 1:			
			Printer.askForLoginCreds();
			Input.credentials(sc);
			break;
		case 2:
			// get username and check if it exists
			break;
		case 3:
			Main.b = false;
			Printer.printExit();
			break;
		}
	}
	
}
