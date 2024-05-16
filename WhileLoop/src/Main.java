public class Main {
    public static void main(String[] args) {
        int number =6;
        while(number>5){
            if(isEvenNumber(number)){
                System.out.println(number);
                number++;
                if(number>20){
                    break;
                }
            }
            number ++;
            if(number>20){
                break;
            }
        }


    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }else{
        return false;}
    }
}