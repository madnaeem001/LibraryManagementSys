import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
public  class Inventorymng {
    Product[] products;
    static int count = 0;

    public Inventorymng(int maxSize) {
        this.products = new Product[maxSize];
    }

    public void addProduct(Product p){
        if(count < products.length) {
            products[count++] = p;
        }
    }

    public void removeProduct(int p) {
        for (int i = 0; i < products.length; i++) {
            if (p == this.products[i].getID()) {
                products[i] = null;
                for (int j = i; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                }
                break;
            }
        }
    }



    public void searchProduct(int e){
        for(int i = 0; i< products.length; i++){
            if(products[i] !=null && e==this.products[i].getID()){
                System.out.println(this.products[i]);

            }
        }
    }
    public void generateProductInfo(){
        int i = 0;
        for(Product p:this.products){
            if(products[i]!=null)
                System.out.println(p+" "+i++);
        }
    }
    public  void updateProduct(int e){
        for(int i = 0; i < products.length; i++){
            if (products[i] != null)
                if(Objects.equals(e, this.products[i].getID())){
                    System.out.println("press 1 to change price and 2 for change in quantity: ");
                    Scanner sc = new Scanner(System.in);

                    try {
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter new price: ");
                                float a = sc.nextFloat();
                                this.products[i].setPrice(a);
                                System.out.println(this.products[i]);
                                break;
                            case 2:
                                System.out.println("Enter Quantity: ");
                                int b = sc.nextInt();
                                this.products[i].setStockQuantity(b);
                                System.out.println(this.products[i]);
                                break;
                        }
                    }catch(InputMismatchException ee){
                        System.out.println("Invalid Input. Try Again...");
                    }
                }
        }
    }
}



