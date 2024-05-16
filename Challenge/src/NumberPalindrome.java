public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println((isPalindrome(-11011))?"Number is palindrome":"Number is not palindrome");
    }
    public static boolean isPalindrome(int number){
        int orginalNumber=number;
        int reverseNumber=0;
        int lastDigit;
        while(number!=0){
            lastDigit=number%10;
            reverseNumber=reverseNumber*10;
            reverseNumber+=lastDigit;
            number=number/10;
        }
        if(orginalNumber==reverseNumber){
            return true;
        }
        return false;

    }
}
