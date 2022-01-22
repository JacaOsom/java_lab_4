public class Kwadrat extends Figura{
    protected double bokKwadratu;
    protected String figura = "kwadrat";



    @Override
    double pole() {
        return bokKwadratu * bokKwadratu;
    }

    @Override
    double obwod() {
        return 4 * bokKwadratu;
    }

    @Override
    String nazwaFigury(String figura) {
        return super.nazwaFigury(figura);
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public Kwadrat(){};
    public Kwadrat(double bokKwadratu) {
        this.bokKwadratu = bokKwadratu;
    }

    public double getBokKwadratu() {
        return bokKwadratu;
    }

    public void setBokKwadratu(double bokKwadratu) {
        this.bokKwadratu = bokKwadratu;
    }
}
