public class RomanNumerals_05 implements RomanNumeralConversor {
    @Override
    public String toRoman(int num) {
        String acumulador = "";

        // Se supone que tenemos menor que 50

        class Pareja {
            int normal;
            String romano;

            public Pareja(int normal, String romano) {
                this.normal = normal;
                this.romano = romano;
            }
        }

        Pareja[] parejas = new Pareja[]{  new Pareja(1, "I"),
                new Pareja(4, "IV"),
                new Pareja(5, "V"),
                new Pareja(9, "IX"),
                new Pareja(10, "X"),
                new Pareja(40, "XL"),
                new Pareja(50, "L"),
                new Pareja(90, "XC"),
                new Pareja(100, "C"),
                new Pareja(400, "CD"),
                new Pareja(500, "D"),
                new Pareja(900, "CM"),
                new Pareja(1000, "M")};

        for (int i = parejas.length - 1; i >= 0; i--) {
            Pareja pareja = parejas[i];
            while (num >= pareja.normal) {
                acumulador += pareja.romano;
                num = num - pareja.normal;
            }
        }

        return acumulador;
    }
}
