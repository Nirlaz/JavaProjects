public class LeapYear {
    public static void main(String[] args) {
        if (isLeapYear(1800)) {
            System.out.println("This is leap year");
        } else {
            System.out.println("This is not leap year");
        }
    }

        public static boolean isLeapYear(int year) {
            //if year is greater than 1 and less than 9999,it valid;
            if (year >= 1 && year <= 9999) {
                if(year%4==0){ //if year is divided by 4,go to next step;

                    if(year%100 != 0){//if year isnot divided by 100,its leap year
                        return true;
                    }
                    else{
                        if(year%400==0){
                            return true;
                        }
                        else{
                            return false;
                        }
                    }
                }else{
                    return false;
                }
            }
            return false;
        }
    }

