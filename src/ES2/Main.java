package ES2;

public class Main {
    public static void main(String[] args) {
        Sim sim1 = new Sim("3265548975");

        sim1.recharge(30);
        sim1.addCall("3456542345", 5);
        sim1.addCall("3923546752", 13);
        sim1.addCall("3765432487", 7);
        sim1.addCall("3245678769", 9);
        sim1.addCall("3458765274", 20);
        System.out.println(sim1.printInfo());
    }
}
