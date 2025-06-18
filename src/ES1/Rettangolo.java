package ES1;

public class Rettangolo {
    private int base;
    private int altezza;

    public Rettangolo(int h, int b){
        this.altezza=h;
        this.base=b;
    }

    public int calcoloArea(){
        return base * altezza;
    }

    public int calcoloPerimetro(){
        return 2 * (base + altezza);
    }

    public String stampaRettangolo() {
        return "Area: " + calcoloArea() + ", Perimetro: " + calcoloPerimetro();
    }
    public String stampaDueRettangoli(Rettangolo second){
        int sommaArea = this.calcoloArea() + second.calcoloArea();
        int sommaPerimetro = this.calcoloPerimetro() + second.calcoloPerimetro();
        return "somma area: " + sommaArea + " somma perimetro: " + sommaPerimetro;
    }
}
