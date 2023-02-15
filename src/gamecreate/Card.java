/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamecreate;

/**
 *
 * @author notay
 */
public class Card {

    static Object Value;

    public enum Suit {KING,QUEEN,JOCKER,ACE};
    public enum Rank {ONE,TWO,THREE,FOUR,FIVE,SIX, SEVEN, EIGHT,NINE};
    private Suit s; // enum user defined datatype 
    private Rank v;
    public Card(Suit s,Rank v)
    {
        this.s=s;
        this.v=v;
    }
    /**
     * @return the s
     */
    public Suit getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(Suit s) {
        this.s = s;
    }

    /**
     * @return the v
     */
    public Rank getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Rank v) {
        this.v = v;
    }

@Override

public String toString() {
        String rank = null;
        String suit = null;
        return rank + " of " + suit;
    
    } 
}
