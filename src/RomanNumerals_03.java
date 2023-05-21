public class RomanNumerals_03 implements RomanNumeralConversor {
    @Override
    public String toRoman(int num) {
        String acumulador = "";

        // Se supone que tenemos menor que 50

        int[] normales = new int[]{ 1 ,  4 ,  5 ,  9 ,
                10,  40,  50,  90,
                100, 400, 500, 900,
                1000 };

        String[] romanos = new String[]{ "I", "IV", "V", "IX",
                "X", "XL", "L", "XC",
                "C", "CD", "D", "CM",
                "M"};

        for (int i = normales.length - 1; i >= 0; i--) {
            int normal = normales[i];
            String romano = romanos[i];
            while (num >= normal) {
                acumulador += romano;
                num = num - normal;
            }
        }

        return acumulador;
    }
}
