public class Student implements StudentI {

    private String imie;
    private String nazwisko;
    private int nrIndeksu;

    public Student(){}

    public Student(String imie, String nazwisko, int nrIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
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

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public void wykonajMetody(){
        zjedz();
        idz();
        uczSie();
        piszEgzamin();
        spotkajSie();
    }
    @Override
    public String toString() {
        return "Student:" +
                "\nImie: " + imie +
                "\nNazwisko: " + nazwisko +
                "\nNumer Indeksu: " + nrIndeksu;
    }

    @Override
    public void uczSie() {
        System.out.println(nrIndeksu + " uczy się do egzaminu.");
    }

    @Override
    public void piszEgzamin() {
        System.out.println(nazwisko + " pisze właśnie egzamin.");
    }

    @Override
    public void spotkajSie() {
        System.out.println(imie + " " + nazwisko + " idzie spotkać się z ekipką!");
    }

    @Override
    public void zjedz() {
        System.out.println("Student o imieniu: " + imie + " właśnie je śniadanie.");
    }

    @Override
    public void idz() {
        System.out.println(imie + " " + nazwisko + " idzie na uczelnię.");
    }
}
