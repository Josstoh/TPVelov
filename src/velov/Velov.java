package velov;

import metier.Station;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;


public class Velov {

    
    public static void main(String[] args) {     
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            Logger.getLogger(Velov.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        LaFenetre vue = new LaFenetre();
        vue.setVisible(true);
    }
}
