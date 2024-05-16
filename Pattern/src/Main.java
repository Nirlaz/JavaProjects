public class Main {
    public static void main(String[] args) {
        drawingPattern(10);
    }
    public static void drawingPattern(int htime)
    {
        for(int i = 0; i<htime; i++){
            for(int j=0;j<i;j++){
                System.out.print('x');
            }
            System.out.println("");
        }

    }
}