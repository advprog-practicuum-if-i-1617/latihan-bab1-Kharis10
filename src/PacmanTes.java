
import java.util.Scanner;

public class PacmanTes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pacman game = new Pacman();
        String action;
        int a = 1;
        game.startGame();
        while (a > 0) {
            game.status();
            System.out.println("Step Left : " + game.step);
            System.out.println("Score : " + game.score);
            System.out.print("Action (a/d/w/s) (q for Quit) : ");
            action = in.next();
            System.out.println("------");
            if (action.equals("a")) {
                game.moveLeft();
            }
            if (action.equals("d")) {
                game.moveRight();
            }
            if (action.equals("w")) {
                game.moveUp();
            }
            if (action.equals("s")) {
                game.moveDown();
            }
            if (game.score == 5) {
                game.status();
                System.out.println("Step Left : " + game.step);
                System.out.println("Score : " + game.score);
                System.out.println("You Win");
                System.out.println("------");
                a--;
            }
            if (game.step == 0) {
                game.status();
                System.out.println("Step Left : " + game.step);
                System.out.println("Score : " + game.score);
                System.out.println("------");
                System.out.println("Game Over");
                System.out.println("------");
                a--;
            }
            if (action.equals("q")) {
                System.out.println("Game Over");
                a--;
            }
        }
    }
}
