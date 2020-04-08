package namingConventions;

/**
 * @author C15339336
 * The CommentsExample class provides information on the style of commenting we will be using
 * This type of comment is a documentation comment, it describes what each class does, its an integral part of programming and is mandatory in every class.
 */
public class CommentsExample {

	/**
	   * Prints out a String argument thats passed in.
	   * @param word, A string containing
	   * the word to be printed.
	   * @exception Any exception used, none in this case
	   * @return No return value.
	   */ 
	private void printStringArgument(String word) {
		//This is an implementation comment-this line prints out the word
		System.out.println(word);
		
	}

}