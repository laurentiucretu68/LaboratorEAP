import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex4 {
    public static void main(String[] args) {
        /// Grupati stringurile in functie de lungimea lor
        List<String> list = List.of("aa", "bbb", "cc", "dddd");
        Map<Integer, List<String>> result =
                list.stream()
                        .collect(Collectors.groupingBy(x -> x.length()));

        Map<Integer, String> result2 =
                list.stream()
                        .collect(Collectors.groupingBy(x -> x.length(),
                                Collectors.joining()));

        Map<Integer, Long> result3 =
                list.stream()
                        .collect(Collectors.groupingBy(x -> x.length(),
                                Collectors.counting()));

        System.out.println(result + "\n" + result2 + "\n" + result3);
    }
}
