package products;

public class Accessory extends Product{
    private String color;
    private static int idCounterAccessory = 3001;


    public Accessory(String title, Double price, String color){
        super(title, price);
        this.color = color;
    }

    //getter & setter
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return super.toString() + " Color: " + color ;
    }

    @Override
    protected String generateId(){
        return String.format("%04d", idCounterAccessory++);
    }
}
