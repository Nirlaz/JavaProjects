public class Main {
    public static void main(String[] args) {
        String bullerIT = "print a Bullet List:\n"+"\t\u2022 First point\n"+"\t\t\u2022 sub point";
        System.out.println(bullerIT);
        String textBlock = """
                Print a Bullet List:
                     \u2022 First point 
                        \u2022 Sub Point""";
        System.out.println(textBlock);
        int age =35;
        System.out.printf("your age is %d%n",age);
    int yearOfBirth = 2023 - age;
    System.out.printf("Age = %d,Birth year =%d%n",age,yearOfBirth);
        System.out.printf("your age is %.1f%n",(float)age);
        for(int i=1;i<=100000;i*=10){
            System.out.printf("printing %6d %n",i);
        }
        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);
        formattedString = "your age is %d".formatted(age);
        System.out.println(formattedString );
}}