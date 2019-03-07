public class TicTacToe {

    public static void main(String[] args) {

        TicTacToeConstructor tac = new TicTacToeConstructor();
        for (int i = 0; i<10; i++){
            tac.showBoard();
            tac.playGame();
            tac.computerPlay();
        }


    }
}
