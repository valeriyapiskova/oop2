import interfases.Printable;
import java.util.List;

public class Books implements Printable {
    private String BookName;
    public Books(String name){
        this.BookName = name;
    }
    public void print(){
        System.out.println("book");
    }
    public static void printBooks(List<Printable> printable){
        if (printable instanceof Books){
            System.out.println(printable);
        }
    }

}
