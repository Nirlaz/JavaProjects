public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int inMB=kiloBytes/1024;
        int inKB=kiloBytes%1024;
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kiloBytes + " KB = " + inMB + " MB and " + inKB + " KB");
        }}
}