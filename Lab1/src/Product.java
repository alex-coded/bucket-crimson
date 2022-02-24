public class Product {

    private final int uid;
    private int price;
    static int counterUid = 0;
    private String nume;
    private Date dateOfFabrication, dateOfExpiration;

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

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Date getDateOfFabrication() {
        return dateOfFabrication;
    }

    public Date getDateOfExpiration() {
        return dateOfExpiration;
    }
}
