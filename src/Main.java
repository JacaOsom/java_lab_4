import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        Budynek dom1 = new Dom();
        dom1.powierzchnia(180);
        dom1.adresBudynku("Warszawa, ul. Akacjowa 22");
        dom1.kolorDomu(KolorEnum.BIAŁY);
        dom1.liczbaMieszkancow(5);
        dom1.liczbaOkien(16);
        dom1.cenaCalkowita(180, 5870);

        System.out.println(dom1.toString());

        Dom dom2 = new Dom();
        dom2.powierzchnia(121.40);
        dom2.adresBudynku("Gdańsk, ul. Przykładowa 8");
        dom2.kolorDomu(KolorEnum.BRĄZOWY);
        dom2.liczbaMieszkancow(3);
        dom2.liczbaOkien(10);
        dom2.cenaCalkowita(dom2.getPow(), 5050);

        System.out.println();
        System.out.println(dom2.toString());

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */
    }
}
