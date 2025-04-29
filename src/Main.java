import inventory.Inventory;
import products.*;
import products.Accessory;

public class Main {

    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.addItems(new Book("Huda Barakat", "2022", "Literary Fiction", "Pieces of Me", 350.0));
        bookInventory.addItems(new Book("Paulo Coelho", "1988", "Allegorical Fiction", "The Alchemist", 265.0));

        Inventory<Notebook> notebookInventory = new Inventory<>();
        notebookInventory.addItems(new Notebook("Note book", 80.0, 100, false));
        notebookInventory.addItems(new Notebook("Binder", 400.0, 300, true));

        Inventory<Accessory> accessoryInventory = new Inventory<>();
        accessoryInventory.addItems(new Accessory("Pen", 15.0, "blue"));
        accessoryInventory.addItems(new Accessory("Correction", 25.0, "white"));

        //dispaly products
        System.out.println("Books info:");
        bookInventory.displayAll();

        System.out.println();
        System.out.println("NoteBook info:");
        notebookInventory.displayAll();

        System.out.println();
        System.out.println("Accessory info:");
        accessoryInventory.displayAll();

        //remove 2 products
        notebookInventory.removeItemsById(2001);
        accessoryInventory.removeItemsById(3002);

        //price after remove 2 products
        System.out.println();
        System.out.println();
        System.out.println("Total price of books after remove: " + calculateTotalPrice(bookInventory));
        System.out.println();
        System.out.println("Total price of notebooks after remove: " + calculateTotalPrice(notebookInventory));
        System.out.println();
        System.out.println("Total price of accessory after remove: " + calculateTotalPrice(accessoryInventory));

        //find 2 products
        System.out.println();
        System.out.println("Find product with 1002 id: ");
        System.out.println(bookInventory.findItemsById(1002));

        System.out.println();
        System.out.println("Find product with 2001 id: ");
        System.out.println(notebookInventory.findItemsById(2001));

        //discount for 2 products
        bookInventory.applyDiscount("The Alchemist", 30);
        accessoryInventory.applyDiscount("Pen", 5);

        //display all info after discount
        System.out.println();
        System.out.println("Show all products after discount:");

        System.out.println();
        System.out.println("Books info: ");
        bookInventory.displayAll();

        System.out.println();
        System.out.println(" NoteBook info: ");
        notebookInventory.displayAll();

        System.out.println();
        System.out.println("Accessory info: ");
        accessoryInventory.displayAll();


    }

        public static double calculateTotalPrice(Inventory<? extends Product> inventory){
            double totalPrice = 0.0;
            for (Product product : inventory.getItems()){
                totalPrice += product.getPrice();
            }
            return totalPrice;
        }

}