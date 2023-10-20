public class GroceryProduct extends Product{

    private Warranty expirationDate;
    private String nutrition;

    public GroceryProduct(int ID, String name, float price, int stockQuantity, double tax, Type productType, Warranty expirationDate, String nutrition) {
        super(ID, name, price, stockQuantity, tax, productType);
        this.expirationDate = expirationDate;
        this.nutrition = nutrition;
    }

    public Warranty getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Warranty expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void updateExpirationDate(Warranty newExpirationDate){
        this.expirationDate = newExpirationDate;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    @Override
    public String toString() {
        return super.toString()+
                "expiry=" + expirationDate +
                ", nutrition='" + nutrition ;
    }
}
