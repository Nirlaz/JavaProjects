public class ThreeAndFiveChallenge {
    public static void main(String[] args) {
        int countNumber=0;
        int countSum=0;
        for (int number = 1; number <= 1000; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                countSum+=number;
                countNumber++;
                System.out.println("Found number = "+ number);
                if(countNumber==5){
                    break;
                }
            }
        }
        System.out.println("Sum = " +countSum);

    }
}
