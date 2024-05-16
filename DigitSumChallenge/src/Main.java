public class Main {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 1228384840 is = " +(sumDigits(1228384840)));
        System.out.println("The sum of the digits in number 34534 is = " +sumDigits(34534));
        System.out.println("The sum of the digits in number 3245 is = " +sumDigits(3245));
        System.out.println("The sum of the digits in number 9 is = " +sumDigits(9));
        System.out.println("The sum of the digits in number -9 is = " +sumDigits(-9));
    }
    public static int sumDigits(int number){
    if(number<0){
        return -1;
    }
    int sum=0;
    while(number>9){
        sum=number%10;
        number=number/10;

    }
    sum+=number;
    return sum;
    }
}