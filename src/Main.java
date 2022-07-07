public class Main {
    public static void main(String[] args) {
        CreditPaymentService platezh = new CreditPaymentService();
        int mySummCredita = 1_000_000;
        int myCredit1Year = 1;
        int myCredit2Year = 2;
        int myCredit3Year = 3;
        double myProcent = 9.99;
        int myPlatezh1Year = platezh.calculate(mySummCredita, myCredit1Year, myProcent);
        System.out.println();
        System.out.println("Сумма кредита: "+ mySummCredita + " под " + myProcent + "% на " + myCredit1Year + " год. Ваш ежемесячный платеж составит: " + myPlatezh1Year);
        System.out.println();
        int myPlatezh2Year = platezh.calculate(mySummCredita, myCredit2Year, myProcent);
        System.out.println("Сумма кредита: "+ mySummCredita + " под " + myProcent + "% на " + myCredit2Year + " года. Ваш ежемесячный платеж составит: " + myPlatezh2Year);
        System.out.println();
        int myPlatezh3Year = platezh.calculate(mySummCredita, myCredit3Year, myProcent);
        System.out.println("Сумма кредита: "+ mySummCredita + " под " + myProcent + "% на " + myCredit3Year + " год. Ваш ежемесячный платеж составит: " + myPlatezh3Year);
        System.out.println();
    }
}
