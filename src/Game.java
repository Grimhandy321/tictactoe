import java.util.Objects;

public class Game {
    public String[][] gameGrid = new String[3][3];
    public String tokenA ;
    public String tokenB;

    public Game(String tokenA, String tokenB) {
        this.tokenA = tokenA;
        this.tokenB = tokenB;
        for (int i = 0; i < gameGrid.length; i++) {
            for (int j = 0; j < gameGrid[i].length; j++) {
                gameGrid[i][j] =" ";
            }
        }
    }

    public void DrawGame(){
         for (int i = 0; i < gameGrid.length; i++) {
            for (int j = 0; j < gameGrid[i].length; j++) {
                System.out.print(gameGrid[i][j] + ",");
            }
            System.out.println();
        }
    }
    public String getToken(int x,int y){
        return gameGrid[x][y];
    }
    public String checkWinState(){
        for(int x = 0; x< gameGrid.length;x++ ){
            if(!Objects.equals(gameGrid[x][0], " ")){
                if(Objects.equals(gameGrid[x][0], tokenA) && Objects.equals(gameGrid[x][1], tokenA) && Objects.equals(gameGrid[x][2], tokenA)){
                    return tokenA;
                }
                if(Objects.equals(gameGrid[x][0], tokenB) && Objects.equals(gameGrid[x][1], tokenB) && Objects.equals(gameGrid[x][2], tokenB)){
                    return tokenA;
                }
            }
        }
        for(int y = 0; y< gameGrid.length;y++ ){
            if(!Objects.equals(gameGrid[0][y], " ")){
                if(Objects.equals(gameGrid[0][y], tokenA) && Objects.equals(gameGrid[1][y], tokenA) && Objects.equals(gameGrid[2][y], tokenA)){
                    return tokenA;
                }
                if(Objects.equals(gameGrid[0][y], tokenB) && Objects.equals(gameGrid[1][y], tokenB) && Objects.equals(gameGrid[2][y], tokenB)){
                    return tokenA;
                }
            }
        }
        if(!Objects.equals(gameGrid[1][1], " ")) {
            if (Objects.equals(gameGrid[0][0], tokenB) && Objects.equals(gameGrid[1][1], tokenB) && Objects.equals(gameGrid[2][0], tokenB)) {
                return tokenB;
            }
            if (Objects.equals(gameGrid[0][0], tokenA) && Objects.equals(gameGrid[1][1], tokenA) && Objects.equals(gameGrid[2][0], tokenA)) {
                return tokenA;
            }
            if (Objects.equals(gameGrid[2][2], tokenB) && Objects.equals(gameGrid[1][1], tokenB) && Objects.equals(gameGrid[0][2], tokenB)) {
                return tokenB;
            }
            if (Objects.equals(gameGrid[2][2], tokenA) && Objects.equals(gameGrid[1][1], tokenA) && Objects.equals(gameGrid[0][2], tokenA)) {
                return tokenA;
            }
        }
        return "";
    }

    public void AddToken(int x ,int y,String token){
        if(Objects.equals(gameGrid[x][y], "")){
            gameGrid[x][y]= token;
        }
    }
}
