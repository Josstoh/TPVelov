package dao;

import metier.*;
import connexion.ConnexionOracleFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.TreeMap;
import java.util.List;


public class DAOStation {
    private static Connection connexionBD = ConnexionOracleFactory.getInstance().connexionBD;
    
	public static boolean inserer(String numero, String nom, int arrondissement, String localisation) {
        try {
            PreparedStatement requete = connexionBD.prepareStatement
                    ("INSERT into station(numeroidentification,nomstation,numeroarrondissementville,localisation)VALUES(?,?,?,?)");
            requete.setString(1,numero);
            requete.setString(2, nom);
            requete.setInt(3,arrondissement);
            requete.setString(4, localisation);
            int inserer = requete.executeUpdate();
            requete.close();
            if(inserer>0)
                setNumeroDerniereStation();
            return (inserer>0);

        } catch (Exception e) {
            System.err.println("Erreur lors de l'insertion : " + e.getMessage());
            return false;
        }
}
        
        
        public static void consultation(TreeMap<String,Station> hm) {
        try {
            Statement requete = connexionBD.createStatement();
            ResultSet resultat = requete.executeQuery
                    ("SELECT numeroidentification,nomstation,numeroarrondissementville,localisation FROM station");
            while (resultat.next()) {
                String numero = resultat.getString(1);
                String nom = resultat.getString(2);
                int numeroArrondissement = resultat.getInt(3);
                String localisation = resultat.getString(4);
                hm.put(numero,new Station(numero,nom,numeroArrondissement,localisation));
            }
            resultat.close();
            requete.close();

        } catch (Exception e) {
            System.err.println("Erreur lors de la consultation : " + e.getMessage());
        }
    }
        
        public static void supprimer(String numero)
    {
        try {
            PreparedStatement requete = connexionBD.prepareStatement("DELETE FROM station WHERE numero = ?");
            requete.setString(1,numero);
            requete.executeUpdate();
            requete.close();

        } catch (Exception e) {
            System.err.println("Erreur lors de l'insertion : " + e.getMessage());
        }
        
    }
    
    public static void modifier(String numero, String nom, int arrondissement, String localisation)
    {
        try {
            PreparedStatement requete = connexionBD.prepareStatement
                    ("UPDATE station SET nomstation = ?,numeroarrondissmentville = ?,localisation = ? WHERE numeroidentification = ?");
            requete.setString(1,nom);
            requete.setInt(2,arrondissement);
            requete.setString(3,localisation);
            requete.setString(4,numero);
            requete.executeUpdate();
            requete.close();

        } catch (Exception e) {
            System.err.println("Erreur lors de la modification : " + e.getMessage());
        }
    }

    public static String getNumeroDerniereStation() {
        try {
            Statement requete = connexionBD.createStatement();
            ResultSet resultat = requete.executeQuery("SELECT valeur FROM constantes WHERE nom = 'num_derniere_station'");
            String valeur = null;
            if (resultat.next()) {
                valeur = resultat.getString(1);
                resultat.close();
                requete.close();
            }

            if (valeur != null) {
                return valeur;
            } else {
                System.err.println("Erreur lors de la récupération du numéro de la dernière réservation...");
            }
            return null;

        } catch (Exception e) {

            System.err.println("erreur" + e.getMessage());
            return null;
        }
    }
    
    public static void setNumeroDerniereStation()
    {
         try {
                Statement requete = connexionBD.createStatement();
                ResultSet resultat = requete.executeQuery("UPDATE constantes SET valeur=valeur+1  WHERE nom = 'num_derniere_station'"); 
                requete.close();
            
        } catch (Exception e) {
            System.err.println("Erreur lors de la MAJ du numéro de la derniere reservation : " + e.getMessage());
        }
    }
         
}
