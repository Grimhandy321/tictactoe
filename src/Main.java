import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Game game = new Game("x", "o");

        System.out.println("Welcome to game TicTacToe.");
        System.out.println();

        game.DrawGame();

        while (!Objects.equals(game.checkWinState(), "")) {

            game.checkWinState();
            game.AddToken(sc.nextInt(), sc.nextInt(), "");
            game.getToken(sc.nextInt(), sc.nextInt());
        }
    }
}