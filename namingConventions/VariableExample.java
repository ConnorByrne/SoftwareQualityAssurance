package namingConventions;

import java.util.Date;

/** 
 * @author C15339336
 * This class describes how we instansiate our variables
 */
public class VariableExample {
	//Example of a one worded String variable
    String name = "James Redmond";
	//Example of an integer variable with an integer value;
	int age = 23;
	//Example of a date variable with multiple words, every inner word is capitalized 
	Date dateOfBirth;
	//Example of a boolean
	Boolean employed = true;
	
	
	//One character variable names should be avoided except for temporary variables, here is an example
	private void tempVariableExample() {
	for(int i =0; i < age; i++)
	{
		//print i
	}

}

}