package polyankina_kvbo0821.prac13.hw13_5;

public class Number {

    private String countryCode;
    private String threeDigits1;
    private String threeDigits2;
    private String fourDigits;

    public String formatNumber(String s) {

        if (s.charAt(0) == '+') {
            countryCode = String.valueOf(s.charAt(1));
            threeDigits1 = s.substring(2, 5);
            threeDigits2 = s.substring(5, 8);
            fourDigits = s.substring(8, 12);
        }
        else {
            countryCode = String.valueOf(s.charAt(0));
            threeDigits1 = s.substring(1, 4);
            threeDigits2 = s.substring(4, 7);
            fourDigits = s.substring(7, 11);
        }
        return '+' + countryCode + threeDigits1 + '-' + threeDigits2 + '-' + fourDigits;

    }

}
