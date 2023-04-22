import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int C = 1_000_000;
        int n = 12;
        double Annuity = service.calculate(C,n);
        int A1 = (int)Annuity;
        System.out.println("Сумма кредита 1000000, ставка 9,99%, срок кредита 1 год");
        System.out.println("Ежемесячный платёж " + A1);
        System.out.println();

        double Annuity2 = (service.calculate(1000000,24));
        int A2 = (int)Annuity2;
        System.out.println("Сумма кредита 1000000, ставка 9,99%, срок кредита 2 года");
        System.out.println("Ежемесячный платёж " + A2);
        System.out.println();

        double Annuity3 = (service.calculate(1000000,36));
        int A3 = (int)Annuity3;
        System.out.println("Сумма кредита 1000000, ставка 9,99%, срок кредита 3 года");
        System.out.println("Ежемесячный платёж " + A3);
    }


}
