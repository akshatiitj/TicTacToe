package game.input;

import java.util.Scanner;

public class PlayerInputForMoveLocation {
    public int[] takeInputFromPlayerForMoveLocation() {
        Scanner in = new Scanner(System.in);

        int InputLocation[] = new int[2];

        InputLocation[0] = in.nextInt();
        InputLocation[1] = in.nextInt();
        return InputLocation;
    }
}
