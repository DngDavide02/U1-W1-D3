package ES3;

public class Main {
    public static void main(String[] args) {
    Customer customer1 = new Customer(
            "2456",
            "Mario",
            "Rossi",
            "mario.rossi@gmail.com",
            "5/2/2020"
    );
    Customer customer2 = new Customer(
            "6432",
            "Luca",
            "Tonini",
            "ToniLuc@gmail.com",
            "25/5/2017"
        );
    Customer customer3 = new Customer(
            "5423",
            "Asia",
            "Lorenzi",
            "Lorenzia@gmail.com",
            "13/7/2024"
        );
        Article articolo1 = new Article("A001", "Mouse Logitech", 25, 10);
        Article articolo2 = new Article("A002", "Tastiera Meccanica", 50, 5);
        Article articolo3 = new Article("A003", "Monitor 24 pollici", 150, 2);
        Article articolo4 = new Article("A004", "IPhone 12", 1050, 200);
        Article articolo5 = new Article("A005", "TV Samsung", 1580, 22);
        Article articolo6 = new Article("A006", "SmartWatch", 150, 60);

        Cart cart1 = new Cart(customer1);
        Cart cart2 = new Cart(customer2);
        Cart cart3 = new Cart(customer3);

        cart1.addArticle(articolo1);
        cart1.addArticle(articolo4);
        cart1.addArticle(articolo6);

        cart2.addArticle(articolo4);

        cart3.addArticle(articolo3);
        cart3.addArticle(articolo5);
        cart3.addArticle(articolo1);
        cart3.addArticle(articolo6);

        System.out.println(cart1.cartPrint() + "\n");
        System.out.println(cart2.cartPrint() + "\n");
        System.out.println(cart3.cartPrint() + "\n");
    }
}
