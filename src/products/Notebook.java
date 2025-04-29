package products;

public class Notebook extends Product{
    private int pageCount;
    private boolean isHardCover;
    private static int idCounterNoteBook = 2001;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover){
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover =isHardCover;
    }

    // getter & setter
    public int getPageCount(){
        return pageCount;
    }

    public boolean isHardCover(){
        return isHardCover;
    }

    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }

    public void setHardCover(boolean isHardCover){
        this.isHardCover = isHardCover;
    }

    @Override
    public String toString(){
        return super.toString() + " " + "Page count: " + pageCount + " Cover type: " + isHardCover;
    }

    @Override
    protected  String generateId(){
        return String.format("%04d", idCounterNoteBook++);
    }

}
