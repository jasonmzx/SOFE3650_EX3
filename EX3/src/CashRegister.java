import java.util.Scanner;

public class CashRegister {

	Keyboard keyboard1 = new Keyboard();
	Display  display1 = new Display();
	
	public void run() {
		
		while(true) {
			
			String Input_UPC = keyboard1.inputUPC();
		    String UPC_Name = DB_Reader.getItemFromDatabase(Input_UPC);
		    
		    display1.Add(UPC_Name);
		    display1.Display();
		    
		}
		
	}
	
}
