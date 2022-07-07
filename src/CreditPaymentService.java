import java.text.DecimalFormat;
import java.util.IllegalFormatPrecisionException;

public class CreditPaymentService {
    public int calculate(int summaCredita, int year, double procent) {
        double result;
        double coff = procent / 12 / 100 * Math.pow(1 + procent / 12 / 100, year * 12) / (Math.pow(1 + procent / 12 / 100, year * 12) - 1);
        result = summaCredita * coff;
        return (int) result;

    }
}
