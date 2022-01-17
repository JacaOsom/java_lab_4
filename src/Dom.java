public class Dom implements Budynek{
    private double pow;
    private String adres;
    private int liczbaOkien;
    private int liczbaMieszkancow;
    private double cenaMKW;
    private KolorEnum kolor;

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getLiczbaOkien() {
        return liczbaOkien;
    }

    public void setLiczbaOkien(int liczbaOkien) {
        this.liczbaOkien = liczbaOkien;
    }

    public int getLiczbaMieszkancow() {
        return liczbaMieszkancow;
    }

    public void setLiczbaMieszkancow(int liczbaMieszkancow) {
        this.liczbaMieszkancow = liczbaMieszkancow;
    }

    public double getCenaMKW() {
        return cenaMKW;
    }

    public void setCenaMKW(double cenaMKW) {
        this.cenaMKW = cenaMKW;
    }

    public KolorEnum getKolor() {
        return kolor;
    }

    public void setKolor(KolorEnum kolor) {
        this.kolor = kolor;
    }

    @Override
    public double powierzchnia(double pow) {
        this.pow = pow;
        return pow;
    }

    @Override
    public String adresBudynku(String adres) {
        this.adres = adres;
        return adres;
    }

    @Override
    public int liczbaOkien(int value) {
        this.liczbaOkien = value;
        return value;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        this.liczbaMieszkancow = value;
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        this.kolor = kolor;
    }

    @Override
    public double cenaCalkowita(double pow, double cenaMKW) {
        this.pow = pow;
        this.cenaMKW = cenaMKW;
        return cenaMKW * pow;
    }

    @Override
    public String toString() {
        return "Dane domu: " +
                "\nPowierzchnia: " + pow +
                "\nAdres: " + adres +
                "\nLiczba okien: " + liczbaOkien +
                "\nLiczba mieszkańców: " + liczbaMieszkancow +
                "\nkolor: " + kolor +
                "\nCena całkowita: " + cenaCalkowita(cenaMKW, pow);
    }
}
