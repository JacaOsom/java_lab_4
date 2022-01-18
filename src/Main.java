import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Grzegorz", "Nowak", 54520);
        System.out.println(student1.toString());
        student1.wykonajMetody();

        System.out.println("");
        Student student2 = new Student("Karolina", "Lewandowska", 65652);
        System.out.println(student2.toString());
        student2.wykonajMetody();

        System.out.println("");
        Pracownik pracownik1 = new Pracownik("Antoni", "Kowalski", 7450, 22);
        System.out.println(pracownik1.toString());
        pracownik1.wykonajDzialania();

        System.out.println("");
        Pracownik pracownik2 = new Pracownik("Bartosz", "Kanapka", 3600, 22);
        System.out.println(pracownik2.toString());
        pracownik2.wykonajDzialania();

        System.out.println("");
        Kierownik kierownik1 = new Kierownik("Kamil", "Węgiel", 12300, 22);
        System.out.println(kierownik1.toString());
        kierownik1.wykonajDzialaniaKierownika();

        System.out.println("");
        Kierownik kierownik2 = new Kierownik("Magda", "Wójcik", 14100, 22);
        System.out.println(kierownik2.toString());
        kierownik2.wykonajDzialaniaKierownika();

        System.out.println("\nLISTA:");
        List<PracownikI> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(pracownik1);
        listaPracownikow.add(pracownik2);
        listaPracownikow.add(kierownik1);
        listaPracownikow.add(kierownik2);

        for (PracownikI item: listaPracownikow) {
            System.out.println("\n" + item.toString());
        }

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów

        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */
    }
}
