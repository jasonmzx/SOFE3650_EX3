import java.util.Scanner;

public class Keyboard {

	Scanner UPC_in;
	
	public Keyboard() {
		//Upon construction of keyboard, instantiate Scanner Stream
	    UPC_in = new Scanner(System.in);  
	}
	
	
	public String inputUPC() {
		String UPC_str_value = UPC_in.nextLine();  // Read user input
	    return UPC_str_value;
	}
	
}
