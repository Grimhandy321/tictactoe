import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Game game = new Game("x", "o");
         String currentPlayer  = "x";
        System.out.println("Welcome to game TicTacToe.");
        System.out.println();
        game.DrawGame();
        while (!Objects.equals(game.checkWinState(), " ")) {
            System.out.println("Napis kam chces kame ve formatu x,y");
            String input = sc.next();
            int x = Integer.parseInt(input.split(",")[0]);
            int y = Integer.parseInt(input.split(",")[1]);
            game.AddToken(x, y, currentPlayer);
            game.DrawGame();
            if(currentPlayer.equals("x")){
                currentPlayer = "o";
            }
            if(currentPlayer.equals("o")){
                currentPlayer = "y";
            }

        }

    }
}