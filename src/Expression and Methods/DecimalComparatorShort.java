public class DecimalComparatorShort {
    public static void main(String[] args) {
        boolean sameDigit=areEqualByThreeDecimalPlaces(-3.128, -3.127);
        if(sameDigit){
            System.out.println("3 Digit are same");
        }
        else{
            System.out.println("3 Digit are not same");
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double first,double second){
        long firstd=1000;
        long secondd=1000;
        firstd*=first;
        secondd*=second;
        return (firstd==secondd)?true:false;

    }

}
