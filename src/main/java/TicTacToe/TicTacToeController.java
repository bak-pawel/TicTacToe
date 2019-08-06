package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class TicTacToeController {
    private Board gameState;
    private List<Player> players;
    private Judge judge;

    public TicTacToeController(Player firstPlayer, Player secondPlayer) {
        this.gameState = new Board(3, 3);
        this.gameState.displayBoar();
        this.players = new ArrayList<Player>();
        this.players.add(firstPlayer);
        this.players.add(secondPlayer);
        this.judge = new Judge(this.gameState);
    }

    public void start() {
        Player currentPlayer = null;
        int moveCounter = 0;
        while (!judge.isEndGame()) {
            currentPlayer = players.get(moveCounter % 2);
            int move = currentPlayer.getMove(gameState);
            if (!MoveValidator.isValid(gameState, move)) {
                System.out.println("Nieprawidłowy ruch");
                continue;
            }
            gameState.putPawn(move, currentPlayer.getPawn());
            gameState.displayBoar();
            moveCounter++;
        }
        System.out.println("Koniec gry");

            if(judge.isWinFor(currentPlayer.getPawn())){
                System.out.println("Wygrał gracz "+currentPlayer.getPawn().getName());

            }else {
                System.out.println("Remis");
            }
        }



    }



