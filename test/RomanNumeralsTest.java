import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {
    @Test
    public void shouldConvertNumbersToRoman() {
        RomanNumeralConversor conversor = new RomanNumerals_01();

        Assert.assertEquals("I",         conversor.toRoman(1));
        Assert.assertEquals("II",        conversor.toRoman(2));
        Assert.assertEquals("III",       conversor.toRoman(3));

        Assert.assertEquals("IV",        conversor.toRoman(4));

        Assert.assertEquals("V",         conversor.toRoman(5));

        Assert.assertEquals("VI",        conversor.toRoman(6));
        Assert.assertEquals("VII",       conversor.toRoman(7));
        Assert.assertEquals("VIII",      conversor.toRoman(8));

        Assert.assertEquals("IX",        conversor.toRoman(9));

        Assert.assertEquals("X",         conversor.toRoman(10));

        Assert.assertEquals("XI",        conversor.toRoman(11));
        Assert.assertEquals("XII",       conversor.toRoman(12));
        Assert.assertEquals("XIII",      conversor.toRoman(13));

        Assert.assertEquals("XIV",       conversor.toRoman(14));

        Assert.assertEquals("XV",        conversor.toRoman(15));

        Assert.assertEquals("XVI",       conversor.toRoman(16));
        Assert.assertEquals("XVII",      conversor.toRoman(17));
        Assert.assertEquals("XVIII",     conversor.toRoman(18));

        Assert.assertEquals("XIX",       conversor.toRoman(19));

        Assert.assertEquals("XX",        conversor.toRoman(20));

        Assert.assertEquals("XXI",       conversor.toRoman(21));
        Assert.assertEquals("XXII",      conversor.toRoman(22));
        Assert.assertEquals("XXIII",     conversor.toRoman(23));

        Assert.assertEquals("XXIV",      conversor.toRoman(24));

        Assert.assertEquals("XXV",       conversor.toRoman(25));

        Assert.assertEquals("XXVI",      conversor.toRoman(26));
        Assert.assertEquals("XXVII",     conversor.toRoman(27));
        Assert.assertEquals("XXVIII",    conversor.toRoman(28));

        Assert.assertEquals("XXIX",      conversor.toRoman(29));

        Assert.assertEquals("XXX",       conversor.toRoman(30));

        Assert.assertEquals("XXXI",      conversor.toRoman(31));
        Assert.assertEquals("XXXII",     conversor.toRoman(32));
        Assert.assertEquals("XXXIII",    conversor.toRoman(33));

        Assert.assertEquals("XXXIV",     conversor.toRoman(34));

        Assert.assertEquals("XXXV",      conversor.toRoman(35));

        Assert.assertEquals("XXXVI",     conversor.toRoman(36));
        Assert.assertEquals("XXXVII",    conversor.toRoman(37));
        Assert.assertEquals("XXXVIII",   conversor.toRoman(38));

        Assert.assertEquals("XXXIX",     conversor.toRoman(39));

        Assert.assertEquals("XL",        conversor.toRoman(40));

        Assert.assertEquals("XLI",       conversor.toRoman(41));
        Assert.assertEquals("XLII",      conversor.toRoman(42));
        Assert.assertEquals("XLIII",      conversor.toRoman(43));

        Assert.assertEquals("XLIV",      conversor.toRoman(44));

        Assert.assertEquals("XLV",       conversor.toRoman(45));

        Assert.assertEquals("XLVI",      conversor.toRoman(46));
        Assert.assertEquals("XLVII",     conversor.toRoman(47));
        Assert.assertEquals("XLVIII",    conversor.toRoman(48));

        Assert.assertEquals("XLIX",      conversor.toRoman(49));

        /*
        Assert.assertEquals("L",         conversor.toRoman(50));

        Assert.assertEquals("LI",        conversor.toRoman(51));
        Assert.assertEquals("LII",       conversor.toRoman(52));
        Assert.assertEquals("LIII",      conversor.toRoman(53));
        */

    }
}
