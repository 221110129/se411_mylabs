import java.util.Arrays;
import java.util.List;

public class PrintableList<T> {

    private List<T> items;

    public PrintableList(T[] array) {
        items = Arrays.asList(array);
    }

    public void printItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}