package abstractclass_13;

public class MyBook extends Book {
    protected int price;
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    protected void display(){
        System.out.println("Title: " + title);
        System.out.println("Author " + author);
        System.out.println("Price: " + price);
    }
}
