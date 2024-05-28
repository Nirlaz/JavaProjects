import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int i=0;
        int sum=0;
        long avg;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter the number = ");
            String nextNumber=  scanner.nextLine();
            try{
                double number=Double.parseDouble(nextNumber);
                i++;
                sum+=number;

            }catch (NumberFormatException e){
                avg=(long)(Math.round(sum/(i-1)));
                System.out.println("Sum="+sum+" AVG ="+avg);
                break;
            }

        }
    }
}

