import interfases.Printable;

import java.util.Objects;

public class Magasine implements Printable {
    private String name;
    public Magasine(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printMagasines(Printable[] printables) {
        System.out.println("ONLY MAGASINES HERE: ");
        for(Printable printable: printables){
            if(printable instanceof Magasine){
                System.out.println(((Magasine) printable).getName());

            }
        }
    }

    @Override
    public void print() {
        System.out.println("this magasine is " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magasine magasine = (Magasine) o;
        return Objects.equals(name, magasine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Magasine{" +
                "name='" + name + '\'' +
                '}';
    }
}
