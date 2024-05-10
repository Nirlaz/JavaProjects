public class DecimalComparator {
    public static void main(String[] args) {
        boolean sameDigit=areEqualByThreeDecimalPlaces(-3.127, -3.127);
        if(sameDigit){
            System.out.println("3 Digit are same");
        }
        else{
            System.out.println("3 Digit are not same");
        }
        sameDigit=areEqualByThreeDecimalPlaces(3.175, 3.176);
        if(sameDigit){
            System.out.println("3 Digit are same");
        }
        else{
            System.out.println("3 Digit are not same");
        }
        sameDigit=areEqualByThreeDecimalPlaces(3.0, 3.0);
        if(sameDigit){
            System.out.println("3 Digit are same");
        }
        else{
            System.out.println("3 Digit are not same");
        }sameDigit=areEqualByThreeDecimalPlaces(-3.123, 3.123);
        if(sameDigit){
            System.out.println("3 Digit are same");
        }
        else{
            System.out.println("3 Digit are not same");
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberFirst, double numberSecond) {
        int firstNumber;
        int secondNumber;
        if(((numberFirst>=0)&&(numberSecond>=0)) || ((numberFirst<0)&&(numberSecond<0))){
            numberFirst = Math.abs(numberFirst);
            numberSecond = Math.abs(numberSecond);
            firstNumber = (int) (numberFirst);
            secondNumber = (int) (numberSecond);
            if (firstNumber == secondNumber) {//3
                numberFirst = numberFirst * 10 - (firstNumber * 10);
                numberSecond = numberSecond * 10 - (secondNumber * 10);
                firstNumber = (int) (numberFirst);
                secondNumber = (int) (numberSecond);
                if (firstNumber == secondNumber) {//1
                    numberFirst = numberFirst * 10 - (firstNumber * 10);
                    numberSecond = numberSecond * 10 - (secondNumber * 10);
                    firstNumber = (int) (numberFirst);
                    secondNumber = (int) (numberSecond);
                    if (firstNumber == secondNumber) {//2
                        numberFirst = numberFirst * 10 - (firstNumber * 10);
                        numberSecond = numberSecond * 10 - (secondNumber * 10);
                        firstNumber = (int) (numberFirst);
                        secondNumber = (int) (numberSecond);
                        if (firstNumber == secondNumber) {//7
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }


                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        else{
            return false;
        }
    }
}