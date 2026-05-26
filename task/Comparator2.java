package day4and5;
import java.util.*;

class Employees {
    int id;
    String name;

    Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

class NameSort implements Comparator<Employees> {

    public int compare(Employees e1, Employees e2) {
        return e1.name.compareTo(e2.name);
    }
}

public class Comparator2 {
    public static void main(String[] args) {

        ArrayList<Employees> list = new ArrayList<>();

        list.add(new Employees(1, "Sai"));
        list.add(new Employees(2, "Anu"));
        list.add(new Employees(3, "prasad"));

        Collections.sort(list, new NameSort());

        System.out.println(list);
    }
}