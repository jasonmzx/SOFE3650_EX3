import java.util.ArrayList;
import java.util.Arrays;

public class Display {

	ArrayList<String> Items = new ArrayList<String>();
	
	public void Add(String Item) {
		Items.add(Item);
	}
	
	public void Display() {
		System.out.println("---------------------");
		
        for (String item : Items) {
        	System.out.println(item);
        }
        
		System.out.println("---------------------");
	}
}
