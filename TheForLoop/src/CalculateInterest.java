public class CalculateInterest {
    public static void main(String[] args) {
        for ( int i = 12;i<=17;i++){
            System.out.println("10,000 at "+ i +"% interest rate = " + calculateInterest(1200,i));
        }
    }
    public static double calculateInterest(double amount,double interestRate){
        return (amount * (interestRate/100));
    }
}
