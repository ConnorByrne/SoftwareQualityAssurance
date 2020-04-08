package namingConventions;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;
/** 
 * @author C15339336
 * This class shows our main error handling methods, 
 * 1. Throwing an error
 * 2. Using a try and catch block
 */

public class ExceptionHandlingExample {

	public ExceptionHandlingExample() {
		// TODO Auto-generated constructor stub
	}
	
	// Throwing an error
	public void getFile(String url) throws FileNotFoundException{
	    if(url.equals(null)) {
	    	throw new FileNotFoundException();
	    }

	}
	
	//Using a try and catch block
	public void getFile2(String url) {
		try{
		    Scanner scanner = new Scanner(new File(url));
		    System.out.println(scanner.nextLine());
			
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getStackTrace());
		}
	
	}
	
}