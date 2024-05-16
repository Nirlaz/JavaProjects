public class GreatestCommonDivisor {
    public static void main(String[] args) {
        getGreatestCommonDivisor(81,153);
    }
    public static void getGreatestCommonDivisor(int first,int second){
        if(first<10 || second <10 )
        {

        }
        int commonfactor=0;
        int i=1;
        while((i<=first && i <=second)){
            if(first%i==0 && second%i==0){
                commonfactor=i;
            }
            i++;
        }
        System.out.println(commonfactor);
    }
}