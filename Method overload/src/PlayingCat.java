public class PlayingCat {
    public static void main(String[] args) {

        if(isCatPlaying(true, 10)){
            System.out.println("Cat is playing");
        }else{
            System.out.println("Cat is not playing");
        }
    }
    public static boolean isCatPlaying(boolean summer,int temperature){
        return (summer && (temperature<=45 && temperature>=25))?true:(!summer && (temperature<=35 && temperature>=25))?true:false;

    }

}