import java.util.Scanner;

public class GamePlayer {
    private char playerSymbol;

    public void setPlayerSymbol(char playerSymbol) {
        this.playerSymbol = playerSymbol;
    }

    public int[] InputLocationOnBoard() {
        Scanner in = new Scanner(System.in);

        int InputLocation[] = new int[2];

        InputLocation[0] = in.nextInt();
        InputLocation[1] = in.nextInt();
        return InputLocation;
    }
}
