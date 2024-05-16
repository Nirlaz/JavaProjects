public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
    public static boolean isOdd(int number){
        if(number%2!=0 && number>0){
            return true;
        }else{
            return false;
        }
    }
    public static int sumOdd(int start,int end){
        int number=0;
        if(start>=0 && end>=0 && start<=end){
            for(int i=start;start<=end;start+=1)
            {
                if(isOdd(start)){
                    number+=start;

                }
            }
            return number;
        }else{return -1;}

    }
}