import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name = "Dragan";
        c.color = "black";
        c.sayMeow();

        int x1 = 070; // Baza 8
        int x2 = 0xff; // Baza 16

        int x4 = 0b101110; // Baza 2
        int x5 = 1_000_000; // Baza 2

        // Default orice numar cu virgula este double
        double x6 = 10.5;
        float x7 = 10.5f;

        // !Oricand avem nevoie de float sau double folosim
        // BigDecimal
        BigDecimal x8 = new BigDecimal("20.5");

        char x9 = 'a';
        char x11 = '\u0100';

        String x13 = "GG";
        String x14 = "H\u0100ELLO\nQ";

        String x15 = """
                    Test
                    las
                """;

        boolean x16 = true;
        boolean x17 = false;
    }
}
