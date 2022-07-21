import interfases.Printable;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[]args){

        Book the_green_mille = new Book("the green mille");
        Book end_of_watch = new Book("and of watch");
        Book mr_mersedes = new Book("mr Mersedes");

        Magasine forbes = new Magasine("Forbes");
        Magasine criminal_history = new Magasine("Criminal History");
        Magasine education = new Magasine("Education");
        Printable[] printables = {the_green_mille,
                                  end_of_watch,
                                  mr_mersedes,
                                  forbes,
                                  criminal_history,
                                  education};
        for(Printable printable:printables){
            printable.print();
        }
        Magasine.printMagasines(printables);
        Book.printBooks(printables);
    }
}
