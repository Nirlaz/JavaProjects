public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3600));
        System.out.println(getDurationString(-130,120));

    }
    public static String getDurationString(int seconds){
        if(seconds<0){
            return ("Invalid");
        }else{
            int minutes = seconds/60;
            int remainSec=seconds%60;
            return getDurationString(minutes,remainSec);
        }
    }
    public static String getDurationString(int minutes,int seconds){
        if(minutes<0 || seconds<0){
            return "Invalid";
        }else{
        minutes+=seconds/60;
        int hour = minutes/60;
        int remainMin=minutes%60;
        int remainSec = seconds%60;
        return ( hour + "h " + remainMin +"m " + remainSec + "s");}
    }
}
