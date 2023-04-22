public class CreditPaymentService {
    public double calculate(int C, int n) {
        double r = Math.pow((1+0.0999/12), n);
        double calculate = C*0.0999/12*r/(r-1);
        return calculate;

    }
}
