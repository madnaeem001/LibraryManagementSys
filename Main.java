import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventorymng  I = new Inventorymng(100);

        Laptop l = new Laptop(0001, "Dell",20000, 34, 3.4, Type.ELECTRONICS,400, 2, "hard", 3, new ScreenDimension(17,12));
        SmartPhones p = new SmartPhones(0002, "iPhone", 202000, 303, 4.4, Type.ELECTRONICS ,450, 2, "soft", 4, 5);
        AudioDevices a = new AudioDevices(0003, "Speaker", 2030, 304, 5.5,Type.ELECTRONICS, 500,2);
        Seats s = new Seats(0004, "Chairs", 2040, 305, 6.6,  Type.FURNITURE,"Plastic" ,new ScreenDimension(10,10),200);
        Tables t = new Tables(0005, "Dining", 20500, 306, 7.7, Type.FURNITURE ,"Wood",new ScreenDimension(50,30),  "round");

        I.addProduct(l);
        I.addProduct(p);
        I.addProduct(a);
        I.addProduct(s);
        I.addProduct(t);

        int i;
        do{
            System.out.println("Menu:\npress\n1 to search Product\n2 to update Product\n3 to generate product details\n4 to remove Product\n -1 to exit\n____________________\n Enter your Choice:");
            try {
                i = sc.nextInt();
                switch(i) {
                    case 1:
                        System.out.println("Search by id:");
                        try {
                            int x = sc.nextInt();
                            I.searchProduct(x);
                        }catch(InputMismatchException ee){
                            System.out.println("Invalid Input. Try again...");
                        }
                        break;

                    case 2:
                        System.out.println("Update product price or quantity by id:");
                        try {
                            int y = sc.nextInt();
                            I.updateProduct(y);
                        }catch(InputMismatchException ee){
                            System.out.println("Invalid Input, Try Again...");
                        }
                        break;

                    case 3:
                        System.out.println("Generating info.....");
                        I.generateProductInfo();
                        break;

                    case 4:
                        System.out.println("Enter Unique Id to remove Product:");
                        try{
                            int y = sc.nextInt();
                            I.removeProduct(y);
                            System.out.println("Product Removed Successfully");
                        }catch(InputMismatchException ee){
                            System.out.println("Invalid Input, Try Again...");

                            break;

                        }

                    case -1:
                        System.out.println("Exiting the program....");
                        break;
                    default:
                        System.out.println("Invalid Input. Try Again....");
                }
            }catch(InputMismatchException e){
                System.out.println("Incorrect Input. Try Again with Integer...");
                sc.next();
                i = 0;
            }
        }while(i != -1);
        sc.close();
    }


}