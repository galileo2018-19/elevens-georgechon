l# Elevens
Elevens Lab

<p>In the Elevens Lab, you will learn more about Object-Oriented Programming and Design in order to create a simple solitaire game called Elevens. This is the most complex lab so far and you will need to use a variety of concepts that you have learned.</p>

<p>It is good practice to stage, commit, and push your changes each day. This lab will take several weeks to complete so you don't want to accidentally lose any work because you didn't push your changes.</p>


The relationship between deck and card is a "has-a relationship".
The deck will contain 6 cards. 

String [] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
String [] suits = {"Heart","Spade","Clover","Diamond"};
int [] pointValues = {2,3,4,5,6,7,8,9,10,10,10,10,11};

Yes the order of the elements rank and pointValues matter because the card objects are created with the rank corresponding to its point value in each index.
However, the order of the suits do not matter.

public static String flip()
{
    String output = {"Head","Head","Tail"};
    return (output[(int) Math.random()*4])
}

public static Boolean arePermutaion(int[] arr1, int[]arr2)
{
    int counter = 0; 
    for(int i =0; i<arr1.length; i++)
    {
        for(int j=0; j<arr2.length; j++0)
        {
            if(arr1[i]==arr[j])
            {
                counter++;
            }
        }
    }
    return (counter == arr1.length);
}

One possibility of the sequence of random number is 0,1,1,0. 

All the possible plays given that board is [5 clover and 6 clover] and [5 spade and 6 clover].

If the deck is empty and there are only 3 cards left on the board, the three cards have to be j, Q, and K. 
This is because cards eliminated on the board is eliminated in sets of pairs. As a result, if all sets of j, Q, K are eliminated.
There could only be an even amount of card in the game from there on. However, if all pairs of numbers or aces are eliminated, the 
only possible pair of 3 cards is j, Q, and K.

The game involves no strategy. This is because if there are more than 1 option, the player could eliminate the first option follwing by the sceond option unaffected. 
Eliminated the options in different order wouldn't make a difference in the board. 

The items necessary to play a game of elevens on my desk is a deck of cards, an eleven board. The private variables in the 
elevens board would be Card[] cardsOnBoard = new Card[9]; and Card[] eliminatedStack = new Card [52].

The algorithmn for playing the game: 
1. Deal 9 cards on the board. 
2. Player eliminates sets of J,Q,K or cards that add up to 11. Each set of cards eliminated is dealed back. 
3. When there are no possible elimination, player loses and the cards are shuffled back for a new round. 
4. If the amount of card in the eliminated stack is 52, player wins and the cards are shuffled back to deck. 

From the looks of the ElevenBoard class, it contains all the state and behavior for playing the game.  

The deal my card method is called in the start of a game and when a new game occurs. 

The anotherPlayIsPossible() or isLegal() method should contain those two methods. 

The returned ArrayList would contain {0,1,3,6,7}. 


System.out.print("[");
for(Integer num: cIndexes)
{
    System.out.print(cards.get(intValue(num)) + ":"); 
}
System.out.print("]");


The anotherPlayIsPossible() method has to call cardIndexes before calling the methods. This is because you cannot check a null card index with a card. 
This would lead to a nullPointerexception.

The similarities of the three game is that they all have a deck of card, card is dealed, they have a board, they have an eliminated stack and much more.
There differences lies on the different rule used to play each game 

Inside the ElevensBoard class contains the variable for the board size, rank, suits, and pointvalue.
When we first create a elvensboard object, the eleven board would call the Board abstract class constructor with the data of the rank,suits,pointvalue abd board size. 
The board constructor would create a deck object with the information and then instatiating the board size. 