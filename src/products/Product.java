package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    public Product(String title, Double price, String id){
        this.title = title;
        this.price = price;
        if (id.length() == 4) {
            this.id = id;
        }
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

    public void setId(String id){
        this.id = id;
    }

    public void
}
