public class Main {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            RainbowStudent student = new RainbowStudent(i,switch (i){
                case 1 -> "Nirlaz";
                case 2 -> "Mausam";
                case 3 -> "Nirmal";
                case 4->"Niyam";
                case 5 -> "Laxmi";
                default -> "Anamonus";
            },10+i);
            System.out.println(student);
        }
        for(int i=1;i<=5;i++){
            Student student = new Student(i,switch (i){
                case 1 -> "Nirlaz";
                case 2 -> "Mausam";
                case 3 -> "Nirmal";
                case 4->"Niyam";
                case 5 -> "Laxmi";
                default -> "Anamonus";
            },10+i);
            System.out.println(student);
        }
    }
}