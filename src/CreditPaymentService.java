public class CreditPaymentService {
    public double payment(double credit, double months, double percents) {
        double coefficient = (percents / 100 / months);

        double plusOne = (1 + coefficient);
        double plusOneInLevel = (Math.pow(plusOne, months));

        double resalt = (plusOneInLevel / (plusOneInLevel - 1) * coefficient * credit);
        int finresalt = (int) resalt;
        return finresalt;

    }
}
