/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamecreate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author notay
 */
public class GameCreate {
  private int size = 52;
    Card[] deck = new Card[size]; //Array of objects
    Card[] deck2 = new Card[size];
   
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
         GenerateCard ch = new GenerateCard();
        ch.generateHand(); //cards are generated now 
        for( Card c : ch.deck)
        {
            System.out.println(c.getS() +" "+c.getV());
        }
    }
}