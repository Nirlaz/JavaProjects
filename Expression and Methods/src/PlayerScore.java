public class PlayerScore {
    public static void main(String[] args) {
    String playerName;
    int playerPostion;
    displayHighScorePosition("Nirlaz",calculateHighScorePosition(25));
    }
    public static void displayHighScorePosition(String playerName,int playerPosition){
        System.out.println(playerName + " managed to get into the position "+ playerPosition + " on the high scorelist.");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>=1000 ){
            return 1;
        }else if(playerScore>=500 && playerScore <1000){
            return 2;
        }else if(playerScore>=100 && playerScore<500){
           return 3;
        }else{
           return 4;
        }
    }

}