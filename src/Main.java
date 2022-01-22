public class Main {

    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(7.6);

        System.out.println(kwadrat.nazwaFigury(kwadrat.getFigura()));
        System.out.println("Pole kwadratu: " + kwadrat.pole());
        System.out.println("Obwód kwadratu: " + kwadrat.obwod());

        Prostokat prostokat = new Prostokat(4.2, 6.7);

        System.out.println("");
        System.out.println(prostokat.nazwaFigury(prostokat.getFigura()));
        System.out.println("Pole prostokąta: " + prostokat.pole());
        System.out.println("Obwód prostokąta: " + prostokat.obwod());


        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

    }
}
