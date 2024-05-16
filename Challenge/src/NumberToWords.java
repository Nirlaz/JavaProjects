public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
    public static boolean numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        if(number==0){
            System.out.println("Zero");
        }
        int secondnumber=number;
        number=reverse(number);
        int lastDigit;
        while(number!=0){
            lastDigit=number%10;
            String word=switch(lastDigit){
            case 0->"Zero";
            case 1->"One";
            case 2->"Two";
            case 3->"Three";
            case 4->"Four";
            case 5->"Five";
            case 6->"Six";
            case 7->"Seven";
            case 8->"Eight";
            case 9->"Nine";
            default->"";
        };
        number/=10;
        System.out.println(word);
        }
        if(getDigitCount(secondnumber)!=getDigitCount(reverse(secondnumber))){
            int leading=getDigitCount(secondnumber)-getDigitCount(reverse(secondnumber));
            for(int i=0;i<leading;i++){
                System.out.println("Zero");
            }
        }
        return false;
    }
    public static int reverse(int number){
        int reverse=0;
        int lastdigit;
        while(number!=0){
            reverse*=10;
            lastdigit=number%10;
            reverse+=lastdigit;
            number=number/10;


        }
        reverse+=number;
        return reverse;
    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int count=1;
        while(number>9){
            number/=10;
            count++;
        }
        return count;
    }
}