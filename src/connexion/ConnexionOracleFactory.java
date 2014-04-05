package connexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

public class ConnexionOracleFactory {

    public Connection connexionBD = null;

    private ConnexionOracleFactory() 
    {
        try 
        {
            Properties props = new Properties();
            FileInputStream fichier = new FileInputStream("./src/connexion/connexion.properties");
            props.load(fichier);
            OracleDataSource ods = new OracleDataSource();
            ods.setDriverType(props.getProperty("pilote"));
            ods.setPortNumber(new Integer(props.getProperty("port")).intValue());
            ods.setServiceName(props.getProperty("service"));
            ods.setUser(props.getProperty("user"));
            ods.setPassword(props.getProperty("pwd"));
            ods.setServerName(props.getProperty("serveur"));
            connexionBD = ods.getConnection();
        } 
        catch (Exception e) 
        {
            System.err.println("Erreur lors de la lecture du fichier de configuration pour la connexion " + e.getMessage());
        }
        
        
    }
    
    // L'unique instance de la classe
    private static ConnexionOracleFactory instance = null;

    /**
     * Cette fonction retourne l'unique instance de la classe
     */
    public static ConnexionOracleFactory getInstance() {
        if (instance == null) {
            instance = new ConnexionOracleFactory();
        }
        return instance;
    }
    public static void releaseInstance()
    {
        instance = null;
    }
    //Hebergements
    
}
