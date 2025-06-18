package ES1;

public class Main {
    public static void main(String[] args) {
    Rettangolo r1 = new Rettangolo(5, 20);
        Rettangolo r2 = new Rettangolo(50, 200);
        System.out.println(r1.stampaRettangolo());
        System.out.println(r2.stampaRettangolo());
        System.out.println(r1.stampaDueRettangoli(r2));
    }
}