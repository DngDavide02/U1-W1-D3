package ES3;

public class Article {
    private String articleCode;
    private String articleDesc;
    private int price;
    private int piece;

    public Article(String articleCode, String articleDesc, int price, int piece){
        this.articleCode = articleCode;
        this.articleDesc = articleDesc;
        this.price = price;
        this.piece = piece;

    }
    public String getArticleCode() {
        return articleCode;
    }

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }

    public String getArticleDesc() {
        return articleDesc;
    }

    public void setArticleDesc(String articleDesc) {
        this.articleDesc = articleDesc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public String stampaArticolo(){
        return "Codice: " + articleCode +
                ", Descrizione: " + articleDesc +
                ", Prezzo: " + price +
                ", Pezzi in magazzino: " + piece;
    }

}
