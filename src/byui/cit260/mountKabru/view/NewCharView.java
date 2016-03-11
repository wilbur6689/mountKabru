/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
import byui.cit260.mountKabru.model.Hero;

/**
 *
 * @author Phill
 */
public class NewCharView extends View {
    
   
    public NewCharView() {
    super("what is your name, hero?"); 
    }
    
    private String addStats1 =  "\n"
                + "\n--------------------------------------"
                + "\n|      Create a New Character        |"
                + "\n--------------------------------------"
                + "\n1. If a large tree fell on you and you were trapped, would you:"
                + "\n    [ M ] push with all your might?"
                + "\n    [ W ] user your will to think it away?"
                + "\n"
                + "\nQ - Quit"
                + "\n--------------------------------------";
    
    private String addStats2 =  "\n"
                + "\n--------------------------------------"
                + "\n|      Create a New Character        |"
                + "\n--------------------------------------"
                + "\n2nd question:                         " 
                + "\n    [ M ] push with all your might?"
                + "\n    [ W ] user your will to think it away?"
                + "\n"
                + "\nQ - Quit"
                + "\n--------------------------------------";
    
    private String addStats3 =  "\n"
                + "\n--------------------------------------"
                + "\n|      Create a New Character        |"
                + "\n--------------------------------------"
                + "\n3rd question                           " 
                + "\n    [ M ] push with all your might?"
                + "\n    [ W ] user your will to think it away?"
                + "\n"
                + "\nQ - Quit"
                + "\n--------------------------------------";
    
    
    
    
    
    @Override
    public boolean doAction(String value) {
        
        // create Hero
        String heroName = value;
        
        
        // ask questions
        this.displayMessage = this.addStats1;
        String answer1 = this.getInput().toUpperCase();
        
        
         
        this.displayMessage = this.addStats2;
        String answer2 = this.getInput().toUpperCase();
        
        
        
        this.displayMessage = this.addStats3;
        String answer3 = this.getInput().toUpperCase();
        
       
        
        //Need to set Hero Name, strength, Mana
        GameControl.createHero(heroName, answer1, answer2, answer3);
        
        // create and display game menu view
        // create gameMenuView object
        GameMenuView gameMenuView = new GameMenuView();
        
        //display the game Menu view
        gameMenuView.display();

       
        return false;
    }

    

    
}
