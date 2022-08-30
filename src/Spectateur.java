import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class Spectateur implements PropertyChangeListener {

    String name;

    public Spectateur() {
    }

    public Spectateur(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {


        if (evt.getPropertyName().equals("salto")) {
            String newValue = (String) evt.getNewValue();
            String NameOfSinge = (String) evt.getOldValue();
            System.out.println(this.name + " est en train d'observer " + NameOfSinge +" faire " + newValue);

        }

        if (evt.getPropertyName().equals("TourDePiste")) {

            String newValue = (String) evt.getNewValue();
            String NameOfSinge = (String) evt.getOldValue();
            System.out.println(this.name + "  regarde " + NameOfSinge + " faire un tour de piste " + newValue);

        }

        if (evt.getPropertyName().equals("GranCanyon")) {

            String newValue = (String) evt.getNewValue();
            String NameOfSinge = (String) evt.getOldValue();
            System.out.println(this.name + "  regarde " + NameOfSinge + " faire le grand Canyon " + newValue);

        }
    }

    @Override
    public String toString() {
        return "Spectateur{" +
                "name='" + name + '\'' +
                '}';
    }
}

