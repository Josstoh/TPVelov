package velov;

import dao.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import metier.Station;
import javax.swing.table.AbstractTableModel;

public class MonModele extends AbstractTableModel {

    private String [] libelles = {"Numéro station", "Nom station", "Numéro arrondissement", "Localisation"};
    private TreeMap<String, Station> lesStations = null;
    private ArrayList<Station> valeurs = null;
    
    public MonModele() {
       this.actualiser();
    }
    
    //méthodes à définir obligatoirement
    @Override
    public int getRowCount() {
        return lesStations.size();
    }    

    @Override
    public int getColumnCount() {
        return libelles.length;
    
    }

    @Override
    public Object getValueAt(int row, int col) {
        try {
            
            Station s = valeurs.get(row);
            switch (col) {
                case 0:
                    return s.getNumero();
                case 1:
                    return s.getNom();
                case 2:
                    return s.getArrondissement();
                case 3:
                    return s.getLocalisation();
                default:
                    return null;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    
    @Override
    public String getColumnName(int col){
        return libelles[col];
    }  
    
    public void actualiser()
    {
        if(lesStations != null)
            lesStations.clear();
        else
            lesStations = new TreeMap<>();
        DAOStation.consultation(lesStations);
        this.valeurs = new ArrayList(lesStations.values());
        fireTableDataChanged();
    }
    public void ajouter(Station s){
        lesStations.put(s.getNumero(), s);
        fireTableDataChanged();
    }
    
    public void supprimer(int ligne){
        Station s = valeurs.remove(ligne);
        DAOStation.supprimer(s.getNumero());
        this.actualiser();
        fireTableDataChanged();
    }
    
}
