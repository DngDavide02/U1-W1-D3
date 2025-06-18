package ES3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Customer customer;
    private List<Article> articleList;

    public Cart(Customer customer) {
        this.customer = customer;
        this.articleList = new ArrayList<>();
    }

    public void addArticle(Article article) {
        articleList.add(article);
    }

    public int totSum() {
        int total = 0;
        for (Article a : articleList) {
            total += a.getPrice();
        }
        return total;
    }

    public String cartPrint(){
        String cart = "Cliente: " + customer.getName() + " " + customer.getSurname() + "\n";
        cart += "Articoli nel carrello:\n";

        for(Article a: articleList) {
        cart += "- " + a.stampaArticolo() +"\n";
        }

        cart += "Totale: " + totSum() + "€";
        return cart;
    }


}
