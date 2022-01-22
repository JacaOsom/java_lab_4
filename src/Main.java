import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //zad 1
        String[] tab = new String[]{"AAUDI", "BMW", "MERCEDES", "KIA", "FORD", "VOLKSWAGEN"};
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        boolean isIndexCorrect = false;

        do {
            try{
                System.out.println("Podaj indeks tablicy, który chcesz wyświetlić: ");
                index = Integer.parseInt(scanner.next());
                if (index >= tab.length || index < 0) {
                    System.out.println("Podajesz indeks, który wkracza poza tablicę. Rozmiar tablicy wynosi " + tab.length +
                            " (Czyli wpisz liczbę od 0 do 5");
                } else {
                    System.out.println(tab[index]);
                    isIndexCorrect = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Zły znak! Podaj liczbę");
                scanner.nextLine();
            } finally {
                System.out.println("<BLOK FINALLY>Wykonuje się cały czas");
            }
        }while(!isIndexCorrect);

        //zad 2
        //a
        try {
            String name = null;
            name.length();
        } catch (NullPointerException e){
            System.out.println("Zmienna nie jest zainicjalizowana");
            throw e;
        }

        //b
        try {
            int dzielenie = 15 / 0;
            System.out.println(dzielenie);
        } catch(ArithmeticException e){
            System.out.println("Nie można dzielić przez 0");
            throw e;
        }
            //c
        int[] tab2 = new int[] {1, 2, 3};
        int i;
        try{
            i = Integer.parseInt(scanner.next());
            System.out.println(tab2[i]);
        } catch(InputMismatchException e){
            System.out.println("Zły znak!");
            throw e;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Liczba poza zakresem");
            throw e;
        } finally {
            System.out.println("Hmmm...");
        }

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */



        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

    }
}
