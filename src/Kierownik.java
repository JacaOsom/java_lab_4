public class Kierownik implements PracownikI{
    private String imie;
    private String nazwisko;
    private double wyplata;
    private int liczbaDniWMiesiacu;

    public Kierownik(String imie, String nazwisko, double wyplata, int liczbaDniWMiesiacu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
        this.liczbaDniWMiesiacu = liczbaDniWMiesiacu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getWyplata() {
        return wyplata;
    }

    public void setWyplata(double wyplata) {
        this.wyplata = wyplata;
    }

    public int getLiczbaDniWMiesiacu() {
        return liczbaDniWMiesiacu;
    }

    public void setLiczbaDniWMiesiacu(int liczbaDniWMiesiacu) {
        this.liczbaDniWMiesiacu = liczbaDniWMiesiacu;
    }

    @Override
    public String toString() {
        return "Kierownik:" +
                "\nImie: " + imie +
                "\nNazwisko: " + nazwisko +
                "\nWyplata: " + wyplata;
    }
    public void wykonajDzialaniaKierownika(){
        idz();
        pracuj();
        zrobPrzerwe();
        zjedz();
        dziennyZarobek(liczbaDniWMiesiacu, wyplata);
    }
    @Override
    public void pracuj() {
        System.out.println("Kierownik " + imie + " idzie na spotkanie.");
    }

    @Override
    public void zrobPrzerwe() {
        System.out.println(imie + " " + nazwisko + " robi sobie przerwę od pracy.");
    }

    @Override
    public void dziennyZarobek(int liczbaDniWMiesiacu, double wyplata) {
        System.out.println("Dzienny zarobek kierownika: " + Math.round((wyplata / (double)liczbaDniWMiesiacu)));
    }

    @Override
    public void zjedz() {
        System.out.println("Kierownik: " + imie + " " + nazwisko + " spożywa lunch.");
    }

    @Override
    public void idz() {
        System.out.println(imie + " " + nazwisko + " idzie do biura.");
    }
}
