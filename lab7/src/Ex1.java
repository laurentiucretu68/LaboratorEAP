import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(1);
        list1.add(8);

//        for (int i = 0; i < list1.size(); i++) {
//            System.out.print(list1.get(i) + " ");
//        }

//        System.out.println();
//        for (Integer i: list1) {
//            System.out.print(i + " ");
//        }

        /// Stream
        list1.stream()
                .forEach(x-> System.out.println(x));

        list1.stream()
                .map(x->2*x)
                .forEach(x-> System.out.println(x));

        list1.stream()
                .sorted()
                .forEach(x -> System.out.println(x));


    }
}
