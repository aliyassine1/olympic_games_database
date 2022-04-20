/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olympicgames2;

/**
 *
 * @author Ali yassine
 */
import java.awt.Font;

public class OlympicGames2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         java.awt.EventQueue.invokeLater(() -> {
            new Menu().LoginPage.setVisible(true);
        });
    }
    
}
