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
    
    public MonModele() {
        this.actualiser();
        System.out.println("aaaaaaaaa");
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
        System.out.println("numéro ligne " + row);
        System.out.println("taille HM " + this.lesStations.size());
        Collection<Station> colStations = lesStations.values();
        ArrayList<Station> alStations = new ArrayList(colStations);
        try {
            
            Station s = alStations.get(row);
            System.out.println(s);
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
        //fireTableDataChanged();
    }
    public void ajouterStation(Station s){
        lesStations.put(s.getNumero(), s);
        fireTableDataChanged();
    }
    
    public void supprimer(int ligne){
        lesStations.remove(ligne);
        fireTableDataChanged();
    }
    
}
