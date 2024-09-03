import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        // bir yildda 12 ayi tanimladik //
        final byte PERCENT = 100;
        //yuzdelik hesaplamasi yapmak icin percent tanimladik//

        Scanner scanner = new Scanner(System.in);
        //kullanicidan giris icin yeni nesne tanimladik//
        /*scanner sinifindan turetilmis bir nesne degiskeni
        gibi dusunulur ve bu degisken kullanicidan veri okumak icindir
         */

        int principal = 0;
        float interest_rate = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;
        /* neden principal montlyInterest ve numberOfPayments
        tanimladik cunku while dongusu hata veriyor while dongusunu
        asagida aciklayacagim
         */

        /* neden while dongusu kullandik while konusunu isledigimizde
        belirli siniri olmayan demistik ve biz kullanicidan belirli
        bir aralikta cikti istiyoruz evet ama bu ciktiyi kullanici
        kacinci denemesinde verilen aralikta dogru bilecegini bilemiyoruz
        bu yuzden kullanici aralikta bir deger yazana kadar islem devam
        edebilmesi icin while kullandik
         */
        while (true) {
            System.out.println("PRINCIPAL:");
            principal = scanner.nextInt();
            if (principal > 1000 && principal < 1000000)
                /*evet aklima ilk if gelmisti ama while ile
                nasil baglayacagimi cozememistim ikiside ayi anda
                nasil kullanacagimi bilemedim peki if neden kullandik
                kullanicidan alabilecegi kredi araligini belirtiyruz
                eger bu araliktaysa principal tutar
                 */
                break;
                /* eger bu aralikta degil ise o zaman bize hangi
                aralikta olmali bilgisini verdik
                 */
            System.out.println("$1k -$1M Enter a number between 1000 and 1000000");
        }

        while (true) {
            System.out.println("ANNUAL_INTEREST_RATE");
            interest_rate = scanner.nextFloat();
            if (interest_rate > 0 && interest_rate < 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to30");
            float montlyInterest = interest_rate / PERCENT / MONTHS_IN_YEAR;
            // faiz oranini yuzdelik birimden alik orana donusturur//
        }

        int period = 0;

        while (true) {
            System.out.println("PERIOD");
            period = scanner.nextInt();
            if (period > 1 && period < 30) {
                numberOfPayments = period * MONTHS_IN_YEAR;
                //yilllik kredi suresinin aylik odeme sayisina donusturmek icin//
                break;
            }
                System.out.println("Enter a value between 1 and 30 ");
            }


                double Mortgage = principal *
                    (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
            //mortgage hesaplamasi//

            String mortagageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);
            // mortgage degerini para formatinda bicimlendir//
            System.out.println("Mortagage :" + mortagageFormatted);
        }
    }
