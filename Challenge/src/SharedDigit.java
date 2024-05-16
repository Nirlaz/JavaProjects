public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));

    }

    public static boolean hasSharedDigit(int firstNumber,int secondNumber) {
        if (firstNumber < 10 || firstNumber >99 || secondNumber < 10 || secondNumber >99) {
            return false;
        }
        int secondNumberCopy=secondNumber;
        int flastDigit;
        int slastDigit;
        while (firstNumber > 9) {
            flastDigit = firstNumber % 10;
            secondNumber=secondNumberCopy;
            while(secondNumber>9){
                slastDigit=secondNumber%10;
                secondNumber=secondNumber/10;
                if(flastDigit==slastDigit){
                    return true;
                }
            }
            if(flastDigit==secondNumber){
                return true;
            }
            firstNumber=firstNumber/10;
        }
        secondNumber=secondNumberCopy;
        while(secondNumber>9){
            slastDigit=secondNumber%10;
            secondNumber=secondNumber/10;
            if(firstNumber==slastDigit){
                return true;
            }
        }
        if(firstNumber==secondNumber){
            return true;
        }
        return false;

    }
}
