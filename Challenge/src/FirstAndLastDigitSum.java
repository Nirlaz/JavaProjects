public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        int sum = sumFirstAndLastDigit(5);
        System.out.println(sum);

    }
    public static int sumFirstAndLastDigit(int number){
        int firstDigit;
        if(number<0){
            return -1;
        }
        int lastDigit=number%10;
        while(number>9){
            number=number/10;
        }
        firstDigit=number;
        return (firstDigit+lastDigit);

    }
}
