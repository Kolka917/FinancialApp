public class Converter {
    double rateUSD;
    double rateEUR;
    double rateJPY;

    Converter(double usd, double eur, double jpy) {
        rateUSD = usd;
        rateEUR = eur;
        rateJPY = jpy;
    }

    void convert(double rubles, int currency) {
        if (currency == 1) {
            System.out.println("Your balance is " + rubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("Your balance in euro is " + rubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("Your balance in yens is: " + rubles / rateJPY);
        } else {
            System.out.println("Unknown currency");
        }
    }
}