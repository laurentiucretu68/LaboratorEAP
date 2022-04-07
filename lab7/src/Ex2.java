import java.util.Arrays;
import java.util.HashSet;

public class Ex2 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();

        set1.add("Alina");
        set1.add("Telea");
        set1.add("Miruna");
        set1.add("Nicu");

        /// Nu se parcurge cu for clasic!!!
//        for (String i : set1) {
//            System.out.println(i);
//        }

//        Integer suma = set1.stream()
//                        .map(x -> x.length())
//                        .reduce(0, (x,y)->x+y);
//        System.out.println(suma);

//        int suma = set1.stream()
//                .mapToInt(x->x.length())
//                .sum();
//
//        System.out.println(suma);

        /// Numar de litere distincte
        long nrDis = set1.stream()
                .flatMap(x -> Arrays.stream(x.split("")))
                .distinct()
                .count();

        System.out.println(nrDis);
    }
}
