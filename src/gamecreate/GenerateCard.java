/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamecreate;

/**
 *
 * @author notay
 */
public class GenerateCard {
     private int size =52;
    Card[] deck = new Card[size]; //Array of objects
    Card[] deck2 = new Card[size];
    public void generateHand()
    {
        int c=0;
        for( Card.Suit s :Card.Suit.values() ) //suits -hearts , CLUBS 
        {
            for(Card.Rank v : Card.Rank.values()) //values  1
            {
                deck[c] = new Card(s,v); //hearts,1,deck [1]=hearts,2
                //Card c1 = new Card();
                c++;
            }
        }
    }
}
