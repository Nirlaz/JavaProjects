import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int currentYaar=2081;
        try{
            System.out.println(getInputFromConsole(currentYaar));
        }catch(NullPointerException e){
            System.out.println(getInputFromScanner(currentYaar));
        }
    }
    public static String getInputFromConsole(int currentYear){
        String name=System.console().readLine("What is your name? ");
        System.out.println("Hi! "+ name);
        String dateOfBirth=System.console().readLine("Which year were you born (B.S)? ");
        return "you age is"+(currentYear-Integer.parseInt(dateOfBirth))+"year old.";
    }
    public static String getInputFromScanner(int currentYear){
        Scanner scanner= new Scanner(System.in);
        String dateOfBirth;
        System.out.println("What is your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hi!"+name);
        boolean valid=false;
        int age=0;
        do{
            System.out.println("Enter your date of birth [ "+(currentYear-125)+ " - "+currentYear+" ]");
            try{dateOfBirth = scanner.nextLine();
            age=validDate(currentYear,dateOfBirth);}
            catch(NumberFormatException badUserDate){
                System.out.println("Chareacter not allowed");
            }
            valid=age<0?false:true;
        }while(!valid);
        return "you are "+age+" year old.";
    }
    public static int validDate(int currentYear,String dateOfBirth){
        int dob=Integer.parseInt(dateOfBirth);
        int minDob=currentYear-124;
        if(dob>minDob && dob < currentYear){
            return currentYear-dob;
        }
        return -1;
    }
}