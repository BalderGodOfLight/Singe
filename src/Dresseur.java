import java.util.ArrayList;
import java.util.List;

public class Dresseur {

    String name;

    List<Singe> lesPrimates;
    List<Spectateur> leSpectacle;

    Singe singe1 ;

    public Singe getSinge1() {
        return singe1;
    }

    public void setSinge1(Singe singe1) {
        this.singe1 = singe1;
    }

    public Singe getSinge2() {
        return singe2;
    }

    public void setSinge2(Singe singe2) {
        this.singe2 = singe2;
    }

    public void ordonnerSaltoChien1(Spectateur spec) {
        this.singe1.addPropertyChangeListener(spec);
        this.singe1.salto("salto");
    }



    Singe singe2 ;

    public Dresseur() {
        init();
    }

    public Dresseur(String name) {
        this.name = name;
        init();
    }

    public List<Singe> getLesPrimates() {
        return lesPrimates;
    }

    public void setLesPrimates(List<Singe> lesPrimates) {
        this.lesPrimates = lesPrimates;
    }

    public List<Spectateur> getLeSpectacle() {
        return leSpectacle;
    }

    public void setLeSpectacle(List<Spectateur> leSpectacle) {
        this.leSpectacle = leSpectacle;
    }

    public void addSinge(String typeOfMonkey) {
        int indexSinge = this.lesPrimates.size();
        Singe observable1 = new Singe(typeOfMonkey, indexSinge, name);
        if (!this.getLeSpectacle().isEmpty()) {
            for (Spectateur observer : this.getLeSpectacle()) {
                observable1.addPropertyChangeListener(observer);
            }
        }
        this.lesPrimates.add(observable1);
    }

    public void addSpectateur(String nameOfSpectateur) {
        Spectateur observer = new Spectateur(nameOfSpectateur);
        this.leSpectacle.add(observer);
    }


    private void init() {
        this.lesPrimates = new ArrayList<>();
        this.leSpectacle = new ArrayList<>();
    }

    public void ordonnerTour(String tour1) {
        final String tour2 = tour1 ;
        switch (tour2) {
            case "tour_de_Piste":
                for (Singe singe : this.lesPrimates) {
                    singe.tourDePiste("Tour De Piste");
                }
                break;
            case "Double_salto":
                for (Singe singe : this.lesPrimates) {
                    singe.salto("salto");
                }
                break;
            case "Grand_Canyon":
                for (Singe singe : this.lesPrimates) {
                    singe.GrandCanyon("avec du charme");

                }
                break;
        }
    }

    public void ToStringTotal(){
        this.toString();
        this.lesPrimates.forEach( e -> e.toString());
        this.leSpectacle.forEach(e -> e.toString());
    }

    @Override
    public String toString() {
        return "Dresseur{" +
                "name='" + name + '\'' +
                '}';
    }
}
