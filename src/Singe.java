import javax.print.DocFlavor;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.nio.charset.Charset;
import java.util.Random;

public class Singe {

    String race ;
    String name ;
    private PropertyChangeSupport support;

    public Singe(String race) {
        this.support = new PropertyChangeSupport(this);
        this.race = race;
        this.name = race + generatedString() ;
    }

    private String generatedString() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(7);

        for (int i = 0; i < 7; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));

        }
        return sb.toString();
    }

    public Singe() {
        this.support = new PropertyChangeSupport(this);
    }

    public Singe(String _race , int index) {
        this.support = new PropertyChangeSupport(this);
        this.race = _race;
        this.name = _race + String.valueOf(index);
    }

    public Singe(String typeOfMonkey, int indexSinge, String name) {
        this.support = new PropertyChangeSupport(this);
        this.race = typeOfMonkey;
        this.name = typeOfMonkey + String.valueOf(indexSinge) + "_" + name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }


    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void salto( String letour){
        support.fireIndexedPropertyChange("salto" , 1 , new String(this.name) , new String(letour));
    }

    public void tourDePiste( String letour){
        support.fireIndexedPropertyChange("TourDePiste" , 2 , new String(this.name) , new String(letour));
    }

    public void GrandCanyon(String legrandcanyon) {
        support.fireIndexedPropertyChange("GranCanyon" , 2 , new String(this.name) , new String(legrandcanyon));
    }

    @Override
    public String toString() {
        return "Singe{" +
                "race='" + race + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
