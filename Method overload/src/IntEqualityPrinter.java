public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }
    public static void printEqual(int first,int second,int third){
        if(first<0 || second <0 || third<0){
            System.out.print("Invalid Value");
        }
        else{
            if((first==second)&&(second==third) &&(first==third)){
                System.out.print("All numbers are equal");
            }else if((first!=second)&&(second!=third)&&(first!=third)){
                System.out.print("All numbers are different");

            }else{
                System.out.print("Neither all are equal or different");
            }
        }

    }
}