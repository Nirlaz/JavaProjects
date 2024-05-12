public class Main {
    public static void main(String[] args) {
        for (int number=1; number <= 1000; number ++){
            System.out.print(isNumberPrimer(number)?number+",":"");
        }

    }
    public static boolean isNumberPrimer(int number){
        int count=0;
        if(number >=0 && number<=2){
            return true;
        }else {
            for(int i=2 ;i<number;i++){
                if(number%i==0){
                    count+=1;
                }
            }
            if(count==0){
                return true;
            }
            return false;
        }

    }
}