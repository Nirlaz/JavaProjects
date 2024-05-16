public class AgeCalculator {
    public static void main(String[] args) {
        getAge();
    }
    public static void getAge(){
        int currentYear=2081;
        String name=System.console().readLine("What is your name? ");
        System.out.println("Hi!"+ name);
        String dateOfBirth=System.console().readLine("which year you were born: ");
        System.out.println("You are "+ (currentYear-Integer.parseInt(dateOfBirth)+"year old."));
    }
}
