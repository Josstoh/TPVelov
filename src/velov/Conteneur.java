package velov;

import java.io.*;
import java.util.*;

/**
 * classe générique qui encapsule un conteneur à base de TreeMap
 */
 
public class Conteneur<K extends Comparable<K>, V extends Serializable> {

    private TreeMap<K, V> tM;
    private K cleCourante;

    // constructeurs
    public Conteneur(TreeMap<K, V> t) {
        tM = t;
        cleCourante = null;
    }

    public Conteneur() {
        tM = null;
        cleCourante = null;
    }

    // vide le contenu du conteneur
    public void vider() {
        tM.clear();
        cleCourante = null;
    }

    // renvoie le nombre d'objets présents dans le conteneur
    public int nbElements() {
        return tM.size();
    }

    // indique si le conteneur est vide
    public boolean estVide() {
        return tM.isEmpty();
    }

    // ajoute un élément dans le conteneur
    public boolean ajouter(K cle, V valeur) {
        if (tM.containsKey(cle)) {
            return false;
        }
        tM.put(cle, valeur);
        cleCourante = cle;
        return true;
    }

    //	renvoie l'objet de clé K dans le conteneur ou bien null
    public V obtenir(K cle) {
        if (!tM.isEmpty()) {
            return tM.get(cle);
        }
        return null;
    }

    //	indique si la clé existe dans le conteneur
    public boolean existe(K cle) {
        if (tM.containsKey(cle)) {
            return true;
        }
        return false;
    }

    //	positionnement sur la clé si elle existe
    public boolean positionner(K cle) {
        if (!tM.containsKey(cle)) {
            return false;
        }
        cleCourante = cle;
        return true;
    }

    // supprime du conteneur l'élément à partir de la clé
    public boolean supprimer(K cle) {
        if (tM.isEmpty()) {
            cleCourante = null;
            return false;
        }
        if (!tM.containsKey(cle)) {
            return false;
        }
        if (cle.compareTo(tM.lastKey()) == 0) {
            precedent();
        } else {
            suivant();
        }
        tM.remove(cle);
        return true;
    }

    // positionnement sur l'élément suivant dans l'ordre des clés
    public void suivant() {
        K cle = tM.higherKey(cleCourante);
        if (cle != null) {
            cleCourante = cle;
        }
    }

    // renvoie la clé de l'élément suivant dans l'ordre des clés
    public K cleSuivante() {
        suivant();
        return cleCourante;
    }

    // positionnement sur l'élément précédent dans l'ordre des clés
    public void precedent() {
        K cle = tM.lowerKey(cleCourante);
        if (cle != null) {
            cleCourante = cle;
        }
    }

    // renvoie la clé de l'élément précédent dans l'ordre des clés
    public K clePrecedente() {
        precedent();
        return cleCourante;
    }

    // positionnement sur le premier élément du conteneur
    public void premier() {
        if (!tM.isEmpty()) {
            cleCourante = tM.firstKey();
        }
    }

    // renvoie la plus petite des clés
    public K cleMin() {
        return tM.firstKey();
    }

    // positionnement sur le dernier élément du conteneur
    public void dernier() {
        if (!tM.isEmpty()) {
            cleCourante = tM.lastKey();
        }
    }

    // renvoie la plus grande des clés
    public K cleMax() {
        return tM.lastKey();
    }

    // renvoie la clé de l'objet courant
    public K cleCourante() {
        return cleCourante;
    }

    // Sérialisation dans un fichier - le type V doit être serialisable
    public void sauvegarder(String nomFic) throws Exception {
        File f1 = new File(nomFic); //Déclaration du fichier
        FileOutputStream fs = new FileOutputStream(f1);
        ObjectOutputStream fsObj = new ObjectOutputStream(fs);
        fsObj.writeObject(tM); // Ecriture du conteneur
        fsObj.close(); //On ferme le flot
    }

    // annotation pour supprimer les warnings
    @SuppressWarnings("unchecked")
    // Désérialisation - le type V doit être serialisable
    public void charger(String nomFic) throws Exception {
        File f1 = new File(nomFic); //Déclaration du fichier
        FileInputStream fe = new FileInputStream(f1);
        ObjectInputStream feObj = new ObjectInputStream(fe);
        tM = (TreeMap<K, V>) feObj.readObject();
        feObj.close();      // On ferme le flot
        if (!tM.isEmpty()) // S'il y a des éléments alors index = 0
        {
            cleCourante = tM.firstKey();
        }
    }
} // fin de la classe Conteneur