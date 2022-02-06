package five;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Subject> items = new ArrayList<>();
        items.add(new Subject("Water", 2, 5000));
        items.add(new Subject("Books", 4, 2300));
        items.add(new Subject("Pencil", 1, 4444));
        items.add(new Subject("Money", 3, 3000));
        items.add(new Subject("Calculator", 2, 1200));

        Safe safe = new Safe(12);//вес маскимальный
        safe.makeAllSets(items);
        System.out.println(items);
        System.out.println(" ");
        System.out.println(safe.getBestItems());
    }

}
