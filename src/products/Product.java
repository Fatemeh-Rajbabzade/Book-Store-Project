package products;
public abstract class Product {
    private String title;
    private Double price;
    private String id;
    
    public Product(String title, Double price, String id){
        this.title = title;
        this.price = price;
        this.id = generateId();
    }

    //getter & setter methods
    public String getTitle(){
        return title;
    }

    public String getId(){
        return id;
    }

    public Double getPrice(){
        return price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPrice(Double price){
        this.price = price;
    }

   public String toString(){
        return "ID: " + id + " Title: " + title + " Price: " + price ;
   }

   protected abstract String generateId();


}
