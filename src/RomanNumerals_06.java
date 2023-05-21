import java.util.*;

public class RomanNumerals_06 implements RomanNumeralConversor {
    @Override
    public String toRoman(int num) {
        String acumulador = "";

        Map<Integer, String> parejas = new TreeMap<>();
        parejas.put(1, "I");
        parejas.put(4, "IV");
        parejas.put(5, "V");
        parejas.put(9, "IX");
        parejas.put(10, "X");
        parejas.put(40, "XL");
        parejas.put(50, "L");
        parejas.put(90, "XC");
        parejas.put(100, "C");
        parejas.put(400, "CD");
        parejas.put(500, "D");
        parejas.put(900, "CM");
        parejas.put(1000, "M");

        Comparator cp = new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return -(i1 - i2);
            }
        };

        Set<Integer> normales = new TreeSet<>(cp);
        normales.addAll(parejas.keySet());

        for (int normal : normales) {
            String romano = parejas.get(normal);
            while (num >= normal) {
                acumulador += romano;
                num = num - normal;
            }
        }

        return acumulador;
    }
}
