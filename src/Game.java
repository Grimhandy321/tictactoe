import java.util.Objects;

public class Game {
    public String[][] gameGrid = new String[3][3];
    public String tokenA ;
    public String tokenB;

    public Game(String tokenA, String tokenB) {
        this.tokenA = tokenA;
        this.tokenB = tokenB;
    }

    public String DrawGame(){
        String ret = new String();
        return ret;
    }
    public String getToken(int x,int y){
        return gameGrid[x][y];
    }
    public String checkWinState(){

    }

    public void AddToken(int x ,int y,String token){
        if(Objects.equals(gameGrid[x][y], "")){
            gameGrid[x][y]= token;
        }
    }
}
