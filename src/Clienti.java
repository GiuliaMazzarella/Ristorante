public class Clienti {

    public static void main(String[] args) {
        String ordinazioneLui = "Pizza quattro formaggi";
        String ordinazioneLei = "Pizza alle verdure";
        String bevanda = "Vino della casa";

        System.out.println("I clienti elencano le ordinazioni al cameriere: " + ordinazioneLui + ", " + ordinazioneLei);

        Cameriere mioCameriere = new Cameriere(ordinazioneLui, ordinazioneLei, bevanda);

        //mioCameriere.comanda(ordinazioneLui, ordinazioneLei, bevanda);

        System.out.println("I clienti mangiano quanto ordinato");
    }
}
