public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(1, -2020));


    }
    public static boolean isLeapYear(int year){
        if( year >=1 && year <=9999) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                return true;
            } else{
                return false;
            }

        }else{
            return false;
        }

    }
    public static int getDaysInMonth(int month,int year){
        if(month < 1 || month > 12 ||  year <1 || year >9999){
            return -1;
        }else{
            int checkMonth = switch(month){
                case 1 -> 31;
                case 2 ->(isLeapYear(year))?29:28;
                case 3 -> 31;
                case 4 -> 30;
                case 5 -> 31;
                case 6 -> 30;
                case 7 -> 31;
                case 8 -> 31;
                case 9 -> 30;
                case 10 -> 31;
                case 11 -> 30;
                case 12 -> 31;
                default -> -1;
                };
            return checkMonth;
                }

                }
            }

