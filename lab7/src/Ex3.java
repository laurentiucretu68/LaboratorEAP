import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Ex3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> vocale = List.of(
                "a", "e", "i", "o", "u"
        );

        list.add("Ana");
        list.add("are");
        list.add("mere");

        long count = list.stream()
                .flatMap(x -> Arrays.stream(x.split("")))
                .filter(x -> vocale.contains(x.toLowerCase(Locale.ROOT)))
                .count();

        System.out.println(count);

    }
}
