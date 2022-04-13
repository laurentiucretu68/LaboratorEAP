import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<DiplomaLicenta> diplomaLicentas = new ArrayList<>();

        //1
        Comparator<DiplomaLicenta> c1 = (d1,d2) ->{
            if (d1.getMedie() > d2.getMedie())
                return -1;
            if (d1.getMedie() < d2.getMedie())
                return 1;
            return 0;
        };

        diplomaLicentas.stream()
                .filter( x -> x.getAn()>2000 && x.getAn()<2010)
                .sorted(c1)
                .forEach(System.out::println);

        //2
        diplomaLicentas.stream()
                .filter( x-> x.getMedie() == 2018)
                .filter( x -> x.getFacultate().equals("FMI"))
                .map( x-> x.getSpecializare())
                .distinct()
                .forEach(System.out::println);

        //3
        var list = diplomaLicentas.stream()
                .filter( x-> x.getMedie() == 10)
                .map(DiplomaLicenta::getAbsolvent)
                .collect(Collectors.toList());

        //4
        var list2 = diplomaLicentas.stream()
                .filter( x->x.getSpecializare().equals("Informatica"))
                .count();
    }
}
