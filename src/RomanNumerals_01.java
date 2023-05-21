public class RomanNumerals_01 implements RomanNumeralConversor {

    @Override
    public String toRoman(int num) {
        String acumulador = "";

        // Se supone que tenemos menor que 50

        if (num >= 40) {
            acumulador += "XL";
            num = num - 40;
        }

        while (num >= 10) {
            acumulador += "X";
            num = num - 10;
        }

        if (num == 9) {
            acumulador += "IX";
            num = num - 9;
        }

        if (num >= 5) {
            acumulador += "V";
            num = num - 5;
        }

        if (num == 4) {
            acumulador += "IV";
            num = num - 4;
        }

        while (num >= 1) {
            acumulador += "I";
            num = num - 1;
        }
        return acumulador;
    }
}