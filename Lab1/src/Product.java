public class Product {

    private int uid, price;
    static int counterUid = 0;
    String nume;
    Date dateOfFabrication, dateOfExpiration;

    Product()
    {
        this.price = 0;
        this.nume = "";
        this.dateOfFabrication = new Date();
        this.dateOfExpiration = new Date();
        uid = ++counterUid;
    }
    public Product( String nume,int price, Date dateOfFabrication, Date dateOfExpiration) {
        this.price = price;
        this.nume = nume;
        this.dateOfFabrication = dateOfFabrication;
        this.dateOfExpiration = dateOfExpiration;
        uid = ++counterUid;
    }

    public int getPrice() {
        return price;
    }

    public String getNume() {
        return nume;
    }
}
