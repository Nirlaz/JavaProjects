import java.lang.management.ThreadInfo;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
    }
    public static boolean hasSameLastDigit(int firstNumber,int secondNumber,int thirdNumber){
        if(isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)){
            if(firstNumber%10==secondNumber%10 || secondNumber%10==thirdNumber%10 || firstNumber%10== thirdNumber%10){
            return true;
        }
        return false;}
        return false;
    }
    public static boolean isValid(int number){
        if(number<10 || number >1000){
            return false;
        }
        return true;

    }
}
