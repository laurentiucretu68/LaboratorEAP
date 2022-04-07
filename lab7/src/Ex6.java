import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<Cat> list = new ArrayList<>();
        list.add(new Cat("Pisi", 18));
        list.add(new Cat("Telea", 20));
        list.add(new Cat("Miruna", 20));

        Comparator<Cat> c = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Collections.sort(list, c);
        System.out.println(list);
    }
}
