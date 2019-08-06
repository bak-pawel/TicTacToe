package TicTacToe;

import java.util.Scanner;

public class HumanPlayer extends Player {
    public Scanner scanner = new Scanner(System.in);
    public HumanPlayer(Pawn pawn) {
        super(pawn);
    }

    @Override
    public int getMove(Board board) {
        return  scanner.nextInt();

    }
}
