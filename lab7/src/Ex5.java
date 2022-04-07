import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {
    public static void main(String[] args) {
        List<String> list = List.of("aa", "bbb", "cc", "dddd");
        List<Integer> result = new ArrayList<>();

//        /// Asa nu :)
//        list.stream()
//                .map(x -> x.length())
//                .forEach(x -> result.add(x));

        result = list.stream()
                        .map(x -> x.length())
                                .collect(Collectors.toList());

        System.out.println(result);
    }
}
