public class Prostokat extends Figura{
    protected double pierwszyBokProstokata;
    protected double drugiBokProstokata;
    protected String figura = "prostokąt";

    @Override
    double pole() {
        return pierwszyBokProstokata * drugiBokProstokata;
    }

    @Override
    double obwod() {
        return (2 * pierwszyBokProstokata) + (2 * drugiBokProstokata);
    }

    @Override
    String nazwaFigury(String figura) {
        return super.nazwaFigury(figura);
    }

    public Prostokat(){}

    public Prostokat(double pierwszyBokProstokata, double drugiBokProstokata) {
        this.pierwszyBokProstokata = pierwszyBokProstokata;
        this.drugiBokProstokata = drugiBokProstokata;
    }

    public double getPierwszyBokProstokata() {
        return pierwszyBokProstokata;
    }

    public void setPierwszyBokProstokata(double pierwszyBokProstokata) {
        this.pierwszyBokProstokata = pierwszyBokProstokata;
    }

    public double getDrugiBokProstokata() {
        return drugiBokProstokata;
    }

    public void setDrugiBokProstokata(double drugiBokProstokata) {
        this.drugiBokProstokata = drugiBokProstokata;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

}
