/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String [] ranksArr = {"A","B","C"};
		String [] suitsArr = {"Giraffe","Lion"};
		int [] valuesArr = {2,1,6}; 
		Deck d1 = new Deck(ranksArr,suitsArr,valuesArr);
		System.out.println(d1);
		System.out.println(d1.isEmpty());
		System.out.println(d1.size()); 
		System.out.println(d1.deal());
		String[] empty = {};
		int [] emptyInt = {}; 
		Deck d2 = new Deck(empty,empty,emptyInt); 
		System.out.println(d2);
	}
}
