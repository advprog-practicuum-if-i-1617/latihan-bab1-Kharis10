public class Pacman {
    public int step, score;
    private int positionx, positiony;
    String[][] field
            = {
                {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
                {"#", "<", " ", " ", "@", "@", " ", " ", " ", "#"},
                {"#", " ", " ", " ", " ", " ", "#", "#", "#", "#"},
                {"#", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
                {"#", "#", " ", " ", "@", " ", "#", " ", " ", "#"},
                {"#", " ", " ", " ", " ", " ", " ", " ", "#", "#"},
                {"#", " ", "@", "#", "#", " ", " ", " ", " ", "#"},
                {"#", "@", " ", "#", "#", " ", " ", " ", " ", "#"},
                {"#", " ", " ", "#", "#", "#", " ", " ", " ", "#"},
                {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}};

    public void pacmanPosition(int x, int y) {
        positionx = x;
        positiony = y;
        field[positionx][positiony] = field[x][y];
    }

    public void moveLeft() {
        if (field[positionx][positiony - 1].equals("#")) {
            field [positionx][positiony]=">";
            step--;
        }
        if (field[positionx][positiony - 1].equals(" ")) {
            field[positionx][positiony] = " ";
            field[positionx][positiony - 1] = ">";
            pacmanPosition(positionx, positiony - 1);
            step--;

        }
        if (field[positionx][positiony - 1].equals("@")) {
            scoreGame();
            field[positionx][positiony] = " ";
            field[positionx][positiony - 1] = ">";
            pacmanPosition(positionx, positiony - 1);
            step--;
        }
    }

    public void moveRight() {
        if (field[positionx][positiony + 1].equals("#")) {
            field[positionx][positiony] = "<";
            step--;
        }
        if (field[positionx][positiony + 1].equals(" ")) {
            field[positionx][positiony] = " ";
            field[positionx][positiony + 1] = "<";
            pacmanPosition(positionx, positiony + 1);
            step--;
        }
        if (field[positionx][positiony + 1].equals("@")) {
            scoreGame();
            field[positionx][positiony] = " ";
            field[positionx][positiony + 1] = "<";
            pacmanPosition(positionx, positiony + 1);
            step--;
        }
    }

    public void moveUp() {
        if (field[positionx - 1][positiony].equals("#")) {
            field[positionx][positiony] = "v";
            step--;
        }
        if (field[positionx - 1][positiony].equals(" ")) {
            field[positionx][positiony] = " ";
            field[positionx - 1][positiony] = "v";
            pacmanPosition(positionx - 1, positiony);
            step--;
        }
        if (field[positionx - 1][positiony].equals("@")) {
            scoreGame();
            field[positionx][positiony] = " ";
            field[positionx - 1][positiony] = "v";
            pacmanPosition(positionx - 1, positiony);
            step--;
        }
    }

    public void moveDown() {
        if (field[positionx + 1][positiony].equals("#")) {
            field[positionx][positiony] = "^";
            step--;
        }
        if (field[positionx + 1][positiony].equals(" ")) {
            field[positionx][positiony] = " ";
            field[positionx + 1][positiony] = "^";
            pacmanPosition(positionx + 1, positiony);
            step--;
        }
        if (field[positionx + 1][positiony].equals("@")) {
            scoreGame();
            field[positionx][positiony] = " ";
            field[positionx + 1][positiony] = "^";
            pacmanPosition(positionx + 1, positiony);
            step--;
        }
    }

    public void status() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println("");
        }
    }

    public void startGame() {
        pacmanPosition(1, 1);
        score = 0;
        step = 10;
    }

    public void scoreGame() {
        score++;
    }

    public void stepGame() {
        step++;
    }
}
