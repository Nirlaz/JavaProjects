import java.util.Scanner;

public class InputChallenge {
    public static void main(String[] args) {
        try{
            getInputFromConsole();
        }catch(NullPointerException e){
            getInputFromScanner();
        }
    }
    public static void getInputFromConsole(){
        int i=1;
        do{
            String number=System.console().readLine("Enter number #" + i+": ");
            if(checkValid(number)==-1){
                continue;
            }
            i++;
        }while(i<=5);

    }
    public static void getInputFromScanner(){
        int i=1;
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter number #"+i+": ");
            String nextNumber=scanner.nextLine();
            try{
                int number=Integer.parseInt(nextNumber);
                i++;
                sum+=number;
            }catch (NumberFormatException e){
                System.out.println("Number Invalid");
            }
        }while(i<=5);
        System.out.println("Sum of 5 number is "+sum);
    }
    public static int checkValid(String number){
        int no=Integer.parseInt(number);
        if(no<0){
            return -1;
        }
        return no;
    }
}
