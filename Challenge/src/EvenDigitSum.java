public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
        int reminder;
        while(number>9){
            reminder=number%10;
            if(reminder%2==0){
                sum+=reminder;
            }
            number=number/10;
        }
        if(number%2==0){
            sum+=number;
        }
        return sum;
    }
}
