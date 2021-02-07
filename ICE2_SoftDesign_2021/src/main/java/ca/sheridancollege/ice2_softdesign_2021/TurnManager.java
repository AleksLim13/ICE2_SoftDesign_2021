/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.ice2_softdesign_2021;

import java.util.ArrayList;


/**
 * A class that models playing card Objects. Cards have a value (note that Ace =
 * 1, Jack -11, Queen =12, King = 13) A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers. This code is to be used in ICE1.
 * When you create your own branch, add your name as a modifier.
 *
 * @author Aleks Lim @ Sheridan College 2021
 */
public class TurnManager {

    private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13
    private ArrayList<Card> hand;
    private int possible;
    private int intTemp;
    private String strTemp;
    private ArrayList<Integer> shuffledDeck; 
    private ArrayList<Integer> deckHolder; 
    private ArrayList<String> shuffledSuits;
    private ArrayList<String> suitsHolder;
    private ArrayList<String> suits;
    private ArrayList<Card> deck; 
    private Card cardStuff;

    //Standard deck contains values from 1-13 * 4. 
    //This needs to be shuffled before used
    
  
    public void setDependencies(
             String suit,
             int value,
             ArrayList<Card> hand,
             int possible,
             int intTemp,
             String strTemp,
             ArrayList<Integer> shuffledDeck, 
             ArrayList<Integer> deckHolder, 
             ArrayList<String> shuffledSuits,
             ArrayList<String> suitsHolder,
             ArrayList<String> suits,
             ArrayList<Card> deck,
             Card cardStuff){
    
    this.suit = suit;
    this.value = value; 
    this.hand = hand;
    this.possible = possible;
    this.intTemp = intTemp;
    this.strTemp = strTemp;
    this.shuffledDeck = shuffledDeck; 
    this.deckHolder = deckHolder; 
    this.shuffledSuits = shuffledSuits;
    this.suitsHolder = suitsHolder;
    this.suits = suits;
    this.deck = deck; 
    this.cardStuff = cardStuff;
    }
   
   
    public String getSuit() {
        return suit;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
    
    public void setDeck(ArrayList<Card> newDeck){
     this.deck = newDeck;
    }
    public ArrayList<Card> getHand(){
        return hand; 
    }
    
    public ArrayList<Integer> getShuffledDeck(){
    return shuffledDeck; 
    }
    
    public ArrayList<Integer> getDeckHolder(){
        return deckHolder; 
    }
    
    public ArrayList<String> getSuits(){
    return suits;
    }
    
   
    
    public ArrayList<String> getSuitsHolder(){
        return suitsHolder; 
    
    }
    
    public ArrayList<String> getShuffledSuits(){
        return shuffledSuits;
    }
    
    public void setShuffledSuits(ArrayList<String> newShuffledSuits){
        this.shuffledSuits = newShuffledSuits; 
    }
    
    public void setSuitsHolder(ArrayList<String> newSuitsHolder){
    this.suitsHolder = newSuitsHolder; 
    }
    
    public void setDeckHolder(ArrayList<Integer> newDeckHolder){
    this.deckHolder = newDeckHolder; 
    }
    
    public void setShuffledDeck(ArrayList<Integer> newShuffDeck){
     this.shuffledDeck = newShuffDeck;  
    }
    
    public void setHand(ArrayList<Card> newHand){
        this.hand = newHand; 
    }

    public int getPossible() {
        return possible;
    }

    public int getIntTemp() {
        return intTemp;
    }

    public void setIntTemp(int newIntTemp) {
        this.intTemp = newIntTemp;
    }
    public String getStringTemp() {
        return strTemp;
    }

    public void setStringTemp(String newStringTemp) {
        this.strTemp = newStringTemp;
    }

    public void setPossible(int newPossible) {
        this.possible = newPossible;
    }
    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    
    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<Card> createHand(int size, ArrayList<Card> tDeck){
        ArrayList<Card> cHand = new ArrayList<>();
    for(int i = 0; i < size; i++){
        
        cHand.add(this.startDeal(tDeck));
    }
    return cHand;
    }
    
    //Deal first card and simultaneously remove it from deck
    //Like in real life...
    public Card startDeal(ArrayList<Card> tDeck){
        
      Card card; 
    //A: 
    card = tDeck.get(0);
    
    //B: 
    tDeck.remove(0);
   
    //C: 
    return card; 
    }
    
    
    public void printHand(ArrayList<Card> hand){
     for(int i = 0; i < hand.size(); i++){
         System.out.println(hand.get(i).getValue() + " " + hand.get(i).getSuit());
     }
    }
    
    public void isItHere(ArrayList<Card> hand, int uValue, String uSuit){
     for(int i = 0; i < hand.size(); i++){
         //if(hand.get(i).getValue() == uValue && hand.get(i).getSuit().equals(uSuit)){
            // System.out.println("It's in here at position " + i);
         //}   
     }
    }
    
    public void isItHereAgain(ArrayList<Card> hand, Card luckyCard){
        //String uSuit = luckyCard.getSuit();
        //int uValue = luckyCard.getValue();
     for(int i = 0; i < hand.size(); i++){
         //if(hand.get(i).getValue() == uValue && hand.get(i).getSuit().equals(uSuit)){
            // System.out.println("It's in here at position " + i);
         //}   
     }
    }
    
    
    
    
  

}//End class 
