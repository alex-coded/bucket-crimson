import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Basket {
    final private int id;
    static int counterId = 0;
    List<Product> listOfProducts;

    Basket()
    {
        id = ++counterId;
        listOfProducts = new ArrayList<Product>();
    }

    Basket(List<Product> listOfProducts) {
        id = ++counterId;
        this.listOfProducts = new ArrayList<Product>(listOfProducts);
    }

    public void addProduct(Product product)
    {
        listOfProducts.add(product);
    }

    public void removeProduct(Product product)
    {
        listOfProducts.remove(product);
    }

    public int computeTotal() {
        int sum = 0;
        for(var obj : listOfProducts)
        {
            sum += obj.getPrice();
        }
        return sum;
    }
    public void showProducts()
    {
        System.out.println("The basket no " + id + " contains the following products: ");
        for(var obj : listOfProducts)
        {
            System.out.println(obj.getName() + ": " + obj.getPrice());
        }
        System.out.println("The basket has " + listOfProducts.size() +" products. \nThe total sum of your basket is: " + computeTotal() + " lei\n");

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        for(var obj : listOfProducts)
        {
            if(obj.getDateOfExpiration().getYear() < currentYear)
            {
                System.out.println("The product " + obj.getName() + " is expired");
            }
        }
    }

}
