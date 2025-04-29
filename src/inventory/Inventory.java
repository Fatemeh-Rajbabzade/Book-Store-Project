package inventory;

import products.Product;

import java.util.ArrayList;

public class Inventory <T extends Product> {
    private ArrayList<T> items;

    public Inventory(){
        items = new ArrayList<>();
    }

    //getter & setter
    public ArrayList<T> getItems(){
        return items;
    }

    public void setItems(ArrayList<T> items){
        this.items = items;
    }

    public void applyDiscount(String productName, int discount){
        for (T product : items){
            if (product.getTitle().equals(productName)){
                double  newPrice = product.getPrice() * (1 - (discount / 100.0));
                product.setPrice(newPrice);
            }
        }
    }

    public void addItems(T product){
        items.add(product);
    }

    public void removeItemsById(int id){
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).getId().equals(String.format("%04d", id))){
                items.remove(i);
                break;
            }
        }

    }

    public T findItemsById(int id){
        for (T product : items){
            if(product.getId().equals(String.format("%04d", id))){
                return product;
            }
        }
        System.out.println("product with id: " + id + "not found.");
        return null;

    }

    public void displayAll(){
        for (T product : items){
            System.out.println(product);
        }
    }
}
