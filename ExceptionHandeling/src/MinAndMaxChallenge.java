import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=1;
        int maxNumber=0;
        int minNumber=0;
        do{
            System.out.println("Enter the number #"+i +": ");
            String nextNumber=scanner.nextLine();
            try{
                int number=Integer.parseInt(nextNumber);
                i++;
                if(number<minNumber){
                    minNumber=number;
                }else if(number>maxNumber){
                    maxNumber=number;

                }
            }catch(NumberFormatException e){
                break;
            }
        }while(i!=0);
        System.out.println("Min number = "+minNumber);
        System.out.println("Max number = "+maxNumber);
    }
}
