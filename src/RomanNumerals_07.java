import java.util.*;

public class RomanNumerals_07 implements RomanNumeralConversor {
    @Override
    public String toRoman(int num) {
        String acumulador = "";

        Map<Integer, String> parejas = new TreeMap<>(Collections.reverseOrder());
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

        /*
        for (int normal : parejas.keySet()) {
            String romano = parejas.get(normal);
            while (num >= normal) {
                acumulador += romano;
                num = num - normal;
            }
        }
        */

        for (Map.Entry entry : parejas.entrySet()) {
            int normal = (int) entry.getKey();
            String romano = (String) entry.getValue();
            while (num >= normal) {
                acumulador += romano;
                num = num - normal;
            }
        }

        return acumulador;
    }
}
