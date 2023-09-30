import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class DB_Reader {

	public static String getItemFromDatabase(String inputUPC) {
		System.out.println("Current Working DIR: " + System.getProperty("user.dir"));
		ArrayList<String> readLines = new ArrayList();
		
		 try {
		      
			 //Read File & Scan it
			 File myObj = new File("src/data.txt");
		     Scanner myReader = new Scanner(myObj);
		      
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        readLines.add(data);
		      }
		         
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 
		 //Actually parsing thru the Read Lines, and outputting 
	      for(int i = 0; i < readLines.size(); i++) {
	    	  
		        String[] parts = readLines.get(i).split(" ");
		        
		        String productName = parts[0];
		        String productUPC  = parts[1];
		        
		        if(inputUPC.equals(productUPC)) {
		        	return productName;
		        }
	      }
	      return "";
	}
}
