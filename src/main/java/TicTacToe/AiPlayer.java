package TicTacToe;

import java.util.Random;

public class AiPlayer extends Player {
private Random random = new Random();
    public AiPlayer(Pawn pawn) {
        super(pawn);
    }

    @Override
    public int getMove(Board board) {
        int move;
        do {
           move = random.nextInt(9) + 1;
        }
        while (!MoveValidator.isValid(board, move)) ;
    return move;
    }
}
