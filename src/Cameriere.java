public class Cameriere {

    public Cameriere(String ord1, String ord2, String bev) {
        System.out.println("Il cameriere chiede al pizzaiolo: " + ord1 + ", " + ord2);

        System.out.println("Il cameriere porta " + bev + " al tavolo");

        Pizzaiolo mioPizzaiolo = new Pizzaiolo(ord1, ord2);

        System.out.println("Il cameriere consegna " + ord1 + ", " + ord2 + " al tavolo");
    }

}
