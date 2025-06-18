package ES3;

public class Customer {
    private String clientCode;
    private String name;
    private String surname;
    private String email;
    private String date;

    public Customer(String clientCode, String name, String surname, String email, String date){
        this.clientCode = clientCode;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String stampaCliente(){
        return "Codice cliente: " + clientCode +
                ", Nome: " + name +" "+ surname +
                ", Email: " + email +
                ", Registrato il: " + date;
    }
}
