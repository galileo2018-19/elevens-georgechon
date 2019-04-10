/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card aceOfSpade = new Card("Ace","Spade",1);
		System.out.println(aceOfSpade.suit());
		System.out.println(aceOfSpade.rank());
		System.out.println(aceOfSpade.pointValue());
		Card mysteryCard = new Card("Ace","Spade",1);
		System.out.println(aceOfSpade.matches(mysteryCard));
		System.out.println(aceOfSpade.toString());
	}
}
