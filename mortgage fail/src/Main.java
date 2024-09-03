import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("PRINCIPAL:");
        int principal = scanner.nextInt();
        if (principal > 1000 && principal < 1000000)
        {
            System.out.println("PRINCIPAL"+ principal);
        } else  {
            System.out.println("$1k -$1M Enter a number between 1000 and 1000000");
        }
        System.out.println("ANNUAL_INTEREST_RATE");
        float interest_rate =scanner.nextFloat();
        if (interest_rate> 0 && interest_rate<30){
            System.out.println("ANNUAL_INTEREST_RATE"+interest_rate);

        }
        else {
            System.out.println("Enter a value greater than 0 and less than or equal to30");
        }
        System.out.println("PERIOD");
        int period= scanner.nextInt();
        if(period>1 && period<30){
            System.out.println("period"+period);

        } else {
            System.out.println("Enter a value between 1 and 30 ");

        }

        double Mortgage = principal *
                (interest_rate * Math.pow(1 + interest_rate, period))
                / (Math.pow(1 + interest_rate, period) - 1);

        String mortagageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Mortagage :" + mortagageFormatted);
    }
    /* kodu yazmaya calistim belirli yardimlar aldim mortgage hesaplamasinda
    ama halla kodumda hata var biliyorum mesela soru soruyor
    period u soruyor yanlis evaoladik diyelim sadece su aralikta
    olamsi gerekiyor diyor yeniden sorup dogru cevabi alana kadar
    tekrar etmiyor dusundun=m ne ile yapabilirim tabi ki de while
    dongusu ile yapabilirim ama nasil
     */
}