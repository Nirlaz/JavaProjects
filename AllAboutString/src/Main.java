public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
    }
    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("length = %d %n",length);
        for(int i = 0 ;i<length;i++) {
            System.out.printf("First char = %c %n", string.charAt(i));
            System.out.printf("last char = %c %n",string.charAt(length -(i+1)));

        }

    }
}