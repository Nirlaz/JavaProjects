public class ExampleMethodOverloading {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5,8));
    }
    public static double convertToCentimeters(int heightInch){
        return (heightInch*2.54);

    }
    public static double convertToCentimeters(int heightFeet,int hegightInch){
        heightFeet*=12;
        return convertToCentimeters(heightFeet+hegightInch);
    }

}
