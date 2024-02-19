/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardgame;

//top 2 import statements may not be needed, but error msgs put them here
import cardgame.Card.Suit;
import cardgame.Card.Value;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Danielle
 * CARD GAME DID NOT GENERATE A GOOD CHART IN 
 * VISUAL PARADIGM
 */
public class CardGame {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Card[] hand = new Card[7];
        Random random =new Random();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<hand.length;i++){
            Value value =Card.Value.values()[random.nextInt(13)];
            System.out.println(value);
            
            Suit suit = Card.Suit.values()[random.nextInt(4)];
            
            Card card=new Card(value,suit);
            hand[i]=card;
            
        }   //end of for
        //printing the hand
        for(Card card:hand)
        {
            System.out.println(card.getValue() + "  of " + card.getSuit());
        }//end of for
        
        System.out.println("enter a guess card" );
        
        System.out.println("Enter a value between 1 to 13");
        int valueuser =input.nextInt();
        System.out.println("Enter a suit between 0 to 3");
        int suituser =input.nextInt();
        
        Card userGuess= new Card(Card.Value.values()[valueuser],
                Card.Suit.values()[suituser]);
        
        //check if it matche
        boolean match=false;
        for(Card card:hand){
            if(card.getValue()==userGuess.getValue() && 
               (card.getSuit().equals(userGuess.getSuit())))
            {
                match=true;
                break;
            }
        }//end of for
                
        System.out.println("Did you guess it ?" +match);
    }        
    

    private int attribute;


    
}
