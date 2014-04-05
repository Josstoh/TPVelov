package velov;

import metier.Station;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;


public class Velov {

    
    public static void main(String[] args) {
        //récupérer les étudiants
        TreeMap<String, Station> lesStations = new TreeMap<>();
        lesStations.put("1",new Station("1", "Iut Feyssine", 6, "Rue de la technologie"));
        lesStations.put("2",new Station("2", "Croix luizet", 6, "Rue des bisounours"));
        lesStations.put("3",new Station("3", "Einstein", 6, "Rue des cacahuètes"));
        lesStations.put("4",new Station("4", "Gaston Berger", 6, "Chemin des bananes"));
        lesStations.put("5",new Station("5", "Université Lyon 1", 6, "Avenue des Pandas"));
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            Logger.getLogger(Velov.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        LaFenetre vue = new LaFenetre();
        vue.setVisible(true);
    }
}
