import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Exercise 1
        System.out.println("Exercise 1:");

        String[] names = {"Ali", "Faisal", "Saud"};

        PrintableList<String> printableList =
                new PrintableList<>(names);

        printableList.printItems();


        // Exercise 2
        System.out.println("\nExercise 2:");

        NumberBox<Integer> integerBox = new NumberBox<>();
        integerBox.setItem(10);

        System.out.println("Integer: " + integerBox.getItem());

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setItem(5.5);

        System.out.println("Double: " + doubleBox.getItem());


        // Exercise 3
        System.out.println("\nExercise 3:");

        Transformer<String, String> upperCase =
                text -> text.toUpperCase();

        Transformer<String, Integer> getLength =
                text -> text.length();

        Pipeline<String, String> pipeline = new Pipeline<>();

        Pipeline<String, Integer> finalPipeline =
                pipeline
                        .addTransformer(upperCase)
                        .addTransformer(getLength);

        Object result = finalPipeline.execute("hello");

        System.out.println("Pipeline result: " + result);


        // Exercise 4
        System.out.println("\nExercise 4:");

        List<String> words =
                Arrays.asList("One", "Two", "Three");

        printList(words);

        List<Integer> numbers =
                Arrays.asList(10, 20, 30);

        System.out.println("Sum: " + sumNumbers(numbers));
    }


    public static void printList(List<?> list) {

        for (Object item : list) {
            System.out.println(item);
        }
    }


    public static double sumNumbers(List<? extends Number> list) {

        double sum = 0;

        for (Number number : list) {
            sum += number.doubleValue();
        }

        return sum;
    }
}