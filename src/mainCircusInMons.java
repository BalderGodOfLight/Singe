public class mainCircusInMons {
    public static void main(String[] args) {

        Dresseur maitreDePiste1 = new Dresseur("Jean");
        Dresseur maitreDePiste2 = new Dresseur("John");
        System.out.println(maitreDePiste2.toString());
        maitreDePiste1.addSpectateur("Jeff Goldblum");
        maitreDePiste2.addSpectateur("Jeff Goldblum");
        maitreDePiste1.addSinge("macaque");
        maitreDePiste2.addSinge("gorille");
        maitreDePiste2.addSinge("ouistiti");
        maitreDePiste1.addSinge("gorille");
        for (Singe si : maitreDePiste1.lesPrimates) {
            System.out.println(si.toString());
        }
        for (Singe si : maitreDePiste2.lesPrimates) {
            System.out.println(si.toString());
        }
        for (Spectateur spec : maitreDePiste2.leSpectacle) {
            System.out.println(spec.toString());
        }


        maitreDePiste1.ordonnerTour("tour_de_Piste");
        maitreDePiste2.ordonnerTour("Double_salto");
        maitreDePiste1.ordonnerTour("Grand_Canyon");

/*        this code has served for debug reasons
            Normally junit served in tdd fashion but the observer pattern on
            a non deprecated version is still in study for mockito implementation
        maitreDePiste2.ToStringTotal();
        maitreDePiste1.ToStringTotal();

        maitreDePiste1.setSinge1(new Singe("Gorille"));
        maitreDePiste2.setSinge1(new Singe("Gorille"));/

        Singe sin1 = new Singe("gorille");
        Spectateur spec = new Spectateur("charlot");
        maitreDePiste1.ordonnerSaltoChien1(spec);
        maitreDePiste2.ordonnerSaltoChien1(spec);

        sin1.addPropertyChangeListener(spec);
        sin1.salto("double salto");
        sin1.tourDePiste(" bobo");*/
    }
}
