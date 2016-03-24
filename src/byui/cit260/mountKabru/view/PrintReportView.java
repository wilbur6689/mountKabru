/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

/**
 *
 * @author wibur
 */
public class PrintReportView extends View {
    
    public PrintReportView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n|  You head into the printShop and   |"
                + "\n|  decide what to do next...         |"
                + "\n--------------------------------------"
                + "\n(M) - Print [M]onster Report"
                + "\n(C) - Print [H]ero Report "
                + "\n(F) - Lick some envelopes "
                + "\n "
                + "\n(Q) - [Q]uit"
                + "\n--------------------------------------");
    }



    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "M": // go kill stuff in the plains
                this.monsterReport();
                break;
            case "H": // go kill stuff in the jungle
                this.jungleAdventure();
                break;
            case "F": // go kill stuff in the forest
                this.forestAdventure();
                break;
            case "M": // go kill stuff in the Mountains
                this.mountainAdventure();
                break;

            default:
                System.out.println("\n*** Invalid selection *** Try again");


        }
        return false;
    }
    
}
