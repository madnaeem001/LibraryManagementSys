public class Product {

    private int ID;
    private String name;
    private float price;
    private int stockQuantity;
    private double tax;
    private static int counter = 0;

    public Type productType;


    public Product(int ID, String name, float price, int stockQuantity, double tax, Type productType) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.tax = tax;
        this.productType = productType;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String toString(){
        return String.format("%d , %s , %f$ , %d Pieces , %f , %s",ID,name,price,stockQuantity,tax,productType);
    }


}


