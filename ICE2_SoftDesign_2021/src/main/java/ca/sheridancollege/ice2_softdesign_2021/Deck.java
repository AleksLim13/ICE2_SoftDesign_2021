/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.ice2_softdesign_2021;

import ca.sheridancollege.ice2_softdesign_2021.Card.Suit;
import ca.sheridancollege.ice2_softdesign_2021.Card.Value;
import java.util.ArrayList;

/**
 *
 * @author Aleks Lim @ Sheridan College 2021
 */
public class Deck {

    private Card cardStuff;
    private ArrayList<Card> deck;
    //0:CLUBS | 1:SPADES | 2:DIAMONDS | 3:HEARTS
    
    //Empty constructor  
    public Deck() {

    }

    //Call this first
    public void initDI(Card cardStuff, ArrayList<Card> newDeck) {
        this.cardStuff = cardStuff;
        this.deck = newDeck;
    }

    
    
    //This sets this class's field var deck to output of
    //This classes init deck method 
    public void setInitDeck() {
        this.deck = initDeck(new ArrayList<>());
    }
    
    //Initialize deck with 4 of 1-13. 
    //Of objects as cards with 2 fields 
    public ArrayList<Card> initDeck(ArrayList<Card> tDeck) {

        //A: 
        Value[] vTemp = cardStuff.getValueList();
        Suit[] sTemp = cardStuff.getSuitList();
        
        for (int i = 0; i < vTemp.length; i++) {
            //C: 
            for (int j = 0; j < sTemp.length; j++) {
              
                tDeck.add(new Card(sTemp[j], vTemp[i]));
            }
        }
        return tDeck;
    }
    
    
   
    
    //Main functionality here...The old swaperoo!
    //Swap pairs of card objects at random positions / 52.
    //Needs the actually value of this class's field var
    //deck after it's been initialized. 
    public ArrayList<Card> shuffle(ArrayList<Card> tDeck) {

        //A: Create 
        int rando;
        for (int i = 0; i < deck.size(); i++) {
            rando = (int) (Math.random() * 60) + 1;

            //C: 
            for (int j = 0; j < 1; j++) {

                //C.1: 
                Card temp = tDeck.get(i);
                tDeck.set(i, tDeck.get(rando));
                tDeck.set(rando, temp);

            }//End C

        }
        return tDeck;
    }
    
    //To set a new deck 
    //Just to reset it if needed
    public void setDeck(ArrayList<Card> newDeck) {
        this.deck = newDeck;
    }
   
    
    //Prints deck stoed in this class's deck field var
    //Assumed to be set from actions elsewhere
    public void printDeck() {
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i).getValue());
        }
    }

 
    //Normal getter method 
    //Returns value of field var deck of this class
    public ArrayList<Card> getDeck() {

        return deck;
    }

    

} //End class
