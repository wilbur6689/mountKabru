/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.TavernControl;
import byui.cit260.mountKabru.exceptions.GameControlException;
import byui.cit260.mountKabru.exceptions.TavernControlException;
import static java.lang.Integer.parseInt;

import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class TavernView extends View{
    
   
    
    public TavernView() {
            super ("\n"
                + "\n--------------------------------------"
                + "\n|  You meander in the tavern looking |"
                + "\n|  as tough as you can.               |"  
                + "\n--------------------------------------"
                + "\nT - talk to the [T]avern owner"
                + "\nS - get a room and [S]leep it off"
                + "\nH - buy a [H]ealth potion"
                + "\nM - buy a [M]ana potion"
                + "\nQ - return to town"
                + "\n--------------------------------------");}
    
    
    
    private String promptMessage;

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "T": // go talk to the tavern owner
                this.tavernOwner();
                break;
            case "S": // get a room in the tavern and sleep
                this.sleep();
                break;
            case "H": // buy a health potion
                this.buyHealthPotion();
                break;
            case "M": // buy a mana potion
                this.buyManaPotion();
                break;
                
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    
    
    
    
    
    
    
    
    private void tavernOwner() {
         String levelOfHeroString;
         int levelOfHero;
         try{
         
         this.console.println("What level are you, hero?");
         levelOfHeroString = this.keyboard.readLine();
         levelOfHero = parseInt(levelOfHeroString);

             String result = TavernControl.ownerResponse(levelOfHero);
             this.console.println("\n*** You walk over to the Tavern Owner ***"
                     + "\n*** and ask him for advise:           ***"
                     + "\n "
                     + "\n " + result);
         } catch (Exception e) {
             this.console.println(e.getMessage());
         }

    }
          
    private void sleep() {
        this.console.println("\n*** you sleep well and feel refreshed ***");
    }

    private void buyHealthPotion() {
        BuyHPotionView buypotion = new BuyHPotionView(); //CREATES A NEW HP POTION VIEW

        buypotion.display();
    }

    private void buyManaPotion() {
       BuyMPotionView mPotion = new BuyMPotionView(); // CREATES A NEW MP POTION VIEW

        mPotion.display();

    }
}
